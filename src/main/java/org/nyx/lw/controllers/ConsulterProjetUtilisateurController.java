package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.entities.Utilisateur;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/consulterprojetutilisateur")
public class ConsulterProjetUtilisateurController {

	@Autowired
	private ILendoWalletMetier metier;

	@SuppressWarnings("unused")
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetutilisateur(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String codeU = request.getParameter("codeU");

		/*
		 * récupération du code de l'utilisateur dans la variable de session
		 */
		HttpSession session = request.getSession();
		long codU=(Long) session.getAttribute("codeU");
		
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur(codU);
		
		List <Projet>  projetU = (List<Projet>) metier.getProjetUtilisateur(codU);
		List <Projet> projetUser =  new LinkedList<Projet>();
		for(int i=0; i< projetU.size(); i++){
			Long code = projetU.get(i).getCodeProjet();
			String titre = projetU.get(i).getTitre();
			Projet pro = new Projet();
			pro.setCodeProjet(code);
			pro.setTitre(titre);
			projetUser.add(pro);
		}
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projetUser);
		return json;
		//return a;

	}

}
