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
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CreerProjetController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@RequestMapping (value="/creerprojet")
	public String inscription() {
		return "creerprojet";
	}
	
	@RequestMapping (value="/docreerprojet",method = RequestMethod.POST)
	public @ResponseBody String docreerprojet (HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException {
		String titre = request.getParameter("titre");
		String cathegorie = request.getParameter("cathegorie");
		String montant = request.getParameter("montant");
		/*
		 * récupération du code de l'utilisateur dans la variable de session
		 */
		HttpSession session = request.getSession();
		long codU=(Long) session.getAttribute("codeU");
		/*
		 * initialisation de la catégorie du projet
		 */
		Categorie categorie = new Categorie();
		categorie.setCodeCategorie(null);
		
		ProjetBusiness projet = new ProjetBusiness();
		projet.setCodeProjet((long) 15455);
		projet.setTitre(titre);
		projet.setCategorie(categorie);
		projet.setMontantAttendu(10115);
		//metier.creerProjetBusiness(projet, codU);
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}

}
