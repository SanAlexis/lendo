package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
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
	
		List <Categorie> categories =  metier.getCategories();
		List <Categorie> categorie =  new LinkedList<Categorie>();
		for(int i=0; i< categories.size(); i++){
			Long code = categories.get(i).getCodeCategorie();
			String libelle = categories.get(i).getLibelle();
			Categorie ca = new Categorie();
			ca.setCodeCategorie(code);
			ca.setLibelle(libelle);
			categorie.add(ca);
		}
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(categorie);
		return json;
	}
}
