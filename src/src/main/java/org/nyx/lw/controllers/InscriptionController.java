/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

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
public class InscriptionController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/inscription")
	public String inscription() {
		return "inscription";
	}
	/*
	 * Fonction permettant d'inscrire un utilisateur dans la BD
	 */
	@RequestMapping (value="/doinscription",method = RequestMethod.POST)
	public @ResponseBody
	String doinscription(HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException{
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		/*
		 * méthode permettant d'ajouter l'utilisateur dans la BD
		 */
		/*
		 * retirer les champs ville et pays de la méthode
		 */
		//Utilisateur user=metier.creerUtilisateur(nom, prenom, email, password, password, password);
		/*
		 * foction de création du compte Lendowallet de l'utilisateur
		 */
		
		/*
		 * Utilisateur de test
		 */
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur((long) 151515);
		user.setNom(nom);
		user.setPrenom(prenom);
		user.setEmail(email);
		user.setPassword(password);
		/*
		 * on stocke l'adresse email de l'utilisateur dans une variable de session
		 */
		HttpSession session = request.getSession();
		session.setAttribute("email", user.getEmail());
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;
	}

}
