package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/consulterprojetcategorie")
public class ConsulterCategorieProjetController {

	@Autowired
	private ILendoWalletMetier metier;

	
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetcategorie(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		
		
		/*
		 * Fonction permettant de récupérer les catégories de projet
		 * dans la BD
		 */

		/*
		 * fonction de test
		 */
		Categorie categorie = new Categorie();
		categorie.setCodeCategorie((long) 01);
		categorie.setLibelle("CONSTRUCTION");
		Categorie categorie1 = new Categorie();
		categorie1.setCodeCategorie((long) 02);
		categorie1.setLibelle("ART ET MODE");
		Categorie categorie2 = new Categorie();
		categorie2.setCodeCategorie((long) 03);
		categorie2.setLibelle("AMENAGEMENT");
		Categorie categorie3 = new Categorie();
		categorie3.setCodeCategorie((long) 04);
		categorie3.setLibelle("INORMATIQUE");
		Categorie cat[]={categorie,categorie1,categorie2,categorie3};
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(cat);
		return json;

	}

}
