/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.entities.ProjetFlexible;
import org.nyx.lw.entities.Utilisateur;
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
	public String creerprojet() {
		return "creerprojet";
	}
	
	@RequestMapping (value="/docreerprojet",method = RequestMethod.POST)
	public @ResponseBody String docreerprojet (HttpServletRequest request, HttpServletResponse response) throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		String titre = request.getParameter("titre").toUpperCase();
		long cathegorie = Long.parseLong(request.getParameter("cathegorie"));
		double montant = Double.parseDouble(request.getParameter("montant"));
		int duree = Integer.parseInt(request.getParameter("duree"));
		String type = request.getParameter("type");
		double taux = Double.parseDouble(request.getParameter("taux"));
		String periode = request.getParameter("periode");
	    Date DateCreation = new Date();
	    DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	    Date DateRemboursement = df.parse(periode);
	    
		//long a = Long.parseLong(titre);
		/*
		 * récupération du code de l'utilisateur dans la variable de session
		 */
		HttpSession session = request.getSession();
		long codU=(Long) session.getAttribute("codeU");
		
		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur(codU);
		
		Categorie categorie = new Categorie();
		categorie.setCodeCategorie(cathegorie);
		ObjectMapper objectMapper = new ObjectMapper();
		
		if(type.equals("don")){
			ProjetFlexible projet = new ProjetFlexible();
			projet.setTitre(titre);
			projet.setCategorie(categorie);
			projet.setMontantAttendu(montant);
			projet.setDureeCampagne(duree);
			projet.setPromoteur(user);
			projet.setDateCreation(DateCreation);
			
			ProjetFlexible projet1 = metier.creerProjetFlexible(projet);
			
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(projet1);
			return json;
			
			
			
		}else{
			
			ProjetBusiness projet = new ProjetBusiness();
			projet.setTitre(titre);
			projet.setCategorie(categorie);
			projet.setMontantAttendu(montant);
			projet.setDureeCampagne(duree);
			projet.setPromoteur(user);
			projet.setTauxFixe(taux);
			projet.setDateCreation(DateCreation);
			projet.setDateRemboursement(DateRemboursement);
			
			ProjetBusiness projet1 = metier.creerProjetBusiness(projet);
			
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(projet1);
			return json;
		}
		
		
	}

}
