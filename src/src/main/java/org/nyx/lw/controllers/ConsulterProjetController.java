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
@RequestMapping(value = "/consulterprojet")
public class ConsulterProjetController {

	@Autowired
	private ILendoWalletMetier metier;

	@SuppressWarnings("unused")
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String doPost(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code du projet
		String codeP = request.getParameter("codeP");
		String codeU = request.getParameter("codeU");
		/*
		 * vérification si le projet existe et appartient bien à l'utilisateur renseigné
		 */
		
		/*
		 * Fonction permettant de récupérer les informations sur le projet
		 * dans la BD
		 */

		/*
		 * initialisation d'un projet à des fins de test
		 */
		ProjetBusiness projet = new ProjetBusiness();
		projet.setCodeProjet((long) 11111);
		projet.setTitre("construction");
		projet.setTauxFixe(10000000);
		projet.setPresentation(("<p><strong>cbaibonoaca</strong></p><p><strong><em>ncalnonanc</em></strong></p><p></p><p><em>baibibiabibnaibia</em></p><p> </p>").toString());
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;

	}

}
