/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

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
		/*
		 * méthode permettant de connecter l'utilisateur
		 */
//		boolean connexion = metier.checkLogin(email, password);
//		if(connexion){
//			// en cas de succès de connexion on retourne le code de l'utilisateur
			
			
			
			
				/*
				 * on stocke l'adresse email et le code de l'utilisateur dans une variable de session
				 */
//				HttpSession session = request.getSession();
//				session.setAttribute("codeU", user.getCodeUtilisateur());
//				session.setAttribute("email", user.getEmail());
//		}
//		ObjectMapper objectMapper = new ObjectMapper();
//		 transformation de l'objet java en json
//		String json = objectMapper.writeValueAsString(connexion);
//		return json;
		
		/*
		 * test
		 */
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur((long) 151515);
		if(user.getCodeUtilisateur()==null){
		//en cas d'échec de connxion, on ne retourne rien
			boolean reponse=false;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}else{
			// en cas de succès de connexion on retourne le code de l'utilisateur
			
			
			//on vérifie si l'utilisateur veut garder sa session active à la fermeture du navigateur
			
			user.setEmail(email);
			user.setPassword(password);
			/*
			 * on stocke l'adresse email et le code de l'utilisateur dans une variable de session
			 */
			HttpSession session = request.getSession();
			session.setAttribute("codeU", user.getCodeUtilisateur());
			session.setAttribute("email", user.getEmail());
			
			boolean reponse=true;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}
	}
	/*
	 * l'utilisateur ne souhaite pas être déconnecté à la fermeture du navigateur
	 */
	@RequestMapping (value="/doConnexionpersit",method = RequestMethod.POST)
	public @ResponseBody String doConnexionpersit(HttpServletRequest request, HttpServletResponse responsel) throws JsonGenerationException, JsonMappingException, IOException {
		
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		/*
		 * méthode permettant de connecter l'utilisateur
		 */
//		boolean connexion = metier.checkLogin(email, password);
//		if(connexion){
//			// en cas de succès de connexion on retourne le code de l'utilisateur
			
			
			
			
				/*
				 * on stocke l'adresse email et le code de l'utilisateur dans une variable de session
				 */
//				HttpSession session = request.getSession();
//				session.setAttribute("codeU", user.getCodeUtilisateur());
//				session.setAttribute("email", user.getEmail());
				//creation du cookie contenant l'adresse email
//				Cookie adresse = new Cookie("_adresse_", user.getEmail());
				//coockie expire dans 30 jours
//				adresse.setMaxAge(2592000);
				//création du cookie contenant le mot de passe
//				Cookie pass = new Cookie("_secret_p_", user.getPassword());
//				pass.setMaxAge(2592000);
				//envoi des cookies au navigateur
//				responsel.addCookie(adresse);
//				responsel.addCookie(pass);
//		}
//		ObjectMapper objectMapper = new ObjectMapper();
//		 transformation de l'objet java en json
//		String json = objectMapper.writeValueAsString(connexion);
//		return json;
		
		/*
		 * test
		 */
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur((long) 151515);
		if(user.getCodeUtilisateur()==null){
		//en cas d'échec de connxion, on ne retourne rien
			boolean reponse=false;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}else{
			// en cas de succès de connexion on retourne le code de l'utilisateur
			
			
			//on vérifie si l'utilisateur veut garder sa session active à la fermeture du navigateur
			
			user.setEmail(email);
			user.setPassword(password);
			/*
			 * on stocke l'adresse email et le code de l'utilisateur dans une variable de session
			 */
			HttpSession session = request.getSession();
			session.setAttribute("codeU", user.getCodeUtilisateur());
			session.setAttribute("email", user.getEmail());
			//creation du cookie contenant l'adresse email
			Cookie adresse = new Cookie("_adresse_", user.getEmail());
			//coockie expire dans 30 jours
			adresse.setMaxAge(2592000);
			//création du cookie contenant le mot de passe
			Cookie pass = new Cookie("_secret_p_", user.getPassword());
			pass.setMaxAge(2592000);
			//envoi des cookies au navigateur
			responsel.addCookie(adresse);
			responsel.addCookie(pass);
			
			boolean reponse=true;
			ObjectMapper objectMapper = new ObjectMapper();
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(reponse);
			return json;
		}
	}

}
