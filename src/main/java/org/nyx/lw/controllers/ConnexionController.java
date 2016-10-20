/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.Base64;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Utilisateur;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ConnexionController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/connexion")
	public String connexion() {	
		return "connexion";
	}
	
	@RequestMapping (value="/doConnexion",method = RequestMethod.POST)
	public @ResponseBody String doConnexion(HttpServletRequest request, HttpServletResponse responsel) throws JsonGenerationException, JsonMappingException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String check = request.getParameter("check");

		Utilisateur user = metier.checkUser(email, password);
		Long code = user.getCodeUtilisateur();
		if(code!=null){
		// en cas de succès de connexion on retourne true
			/*
			 * on stocke l'adresse email et le code de l'utilisateur dans une variable de session
			 */
			HttpSession session = request.getSession();
			session.setAttribute("codeU", user.getCodeUtilisateur());
			session.setAttribute("email", user.getEmail());
			//on vérifie si l'utilisateur veut garder sa session active à la fermeture du navigateur
			
			if(check.equals("true")){
				//creation du cookie contenant l'adresse email
				Cookie adresse = new Cookie("_adresse_", Base64.getEncoder().encodeToString(user.getEmail().getBytes("utf-8")));
				//coockie expire dans 30 jours
				adresse.setMaxAge(2592000);
				//création du cookie contenant le mot de passe
				Cookie pass = new Cookie("_secret_p_",Base64.getEncoder().encodeToString(user.getPassword().getBytes("utf-8")) );
				pass.setMaxAge(2592000);
				//envoi des cookies au navigateur
				responsel.addCookie(adresse);
				responsel.addCookie(pass);
			}
			boolean reponse=true;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}else{
	
			//en cas d'échec de connxion, on ne retourne false
			boolean reponse=false;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}
	}
	/*
	 * connexion par coockie
	 * 
	 */
	@RequestMapping (value="/doConnexioncoockie",method = RequestMethod.POST)
	public @ResponseBody String doConnexioncoockie(HttpServletRequest request, HttpServletResponse responsel) throws JsonGenerationException, JsonMappingException, IOException {
		String a =request.getParameter("email");
		String b =request.getParameter("password");
		byte[] email0 = Base64.getDecoder().decode(a);
		byte[] password0 = Base64.getDecoder().decode(b);
		String email=new String(email0, "utf-8");
		String password=new String(password0, "utf-8");

		Utilisateur user = metier.checkUser(email, password);
		if(user.getCodeUtilisateur()!=null){
			HttpSession session = request.getSession();
			session.setAttribute("codeU", user.getCodeUtilisateur());
			session.setAttribute("email", user.getEmail());
			
			boolean reponse=true;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
			
		
		}else{
			//en cas d'échec de connxion, on ne retourne rien
			boolean reponse=false;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
			
		}
	}
}
