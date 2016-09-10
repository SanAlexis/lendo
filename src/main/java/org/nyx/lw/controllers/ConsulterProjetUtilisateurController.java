package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.ProjetBusiness;
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
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un projet à des fins de test
		 */
		ProjetBusiness projet = new ProjetBusiness();
		projet.setCodeProjet((long) 22);
		projet.setTitre("construction");
		projet.setTauxFixe(10000000);
		ProjetBusiness projet1 = new ProjetBusiness();
		projet1.setTitre("aménagement");
		projet1.setCodeProjet((long) 848);
		projet1.setTauxFixe(2545511);
		ProjetBusiness result[]={projet,projet1};
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(result);
		String a = null;
		return json;
		//return a;

	}

}
