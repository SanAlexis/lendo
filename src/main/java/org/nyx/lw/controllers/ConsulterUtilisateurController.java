package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Contribution;
import org.nyx.lw.entities.Motivation;
import org.nyx.lw.entities.SecteurActivite;
import org.nyx.lw.entities.SecteurGeographique;
import org.nyx.lw.entities.Utilisateur;
import org.nyx.lw.metier.ILendoWalletMetier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = "/consulterutilisateur")
public class ConsulterUtilisateurController {

	@Autowired
	private ILendoWalletMetier metier;

	@SuppressWarnings("unused")
	@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String doPost(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String codeU = request.getParameter("codeU");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		//user.setNom("DAMBIA");
		user.setCodeUtilisateur((long) 1111);
		user.setPrenom("Martial Ludovic");
		//user.setDateNaissance("14/03/1993");
		user.setLieuNaissance("Bandjoun");
		user.setAdresse("Yaoundé");
		user.setAdresse2("Bandjoun");
		user.setCodePostal("05 Yaoundé");
		user.setTelephone("694720709");
		user.setEmail("martial.dambia@yahoo.fr");
		user.setExperience("Débutant");
		user.setPassword("nkbjskjbjqqsd4846");
		user.setSourceRevenu("Vol");
		Motivation motivation = new Motivation();
		motivation.setCodeMotviation((long) 11);
		user.setMotivation(motivation);
		SecteurActivite activite = new SecteurActivite();
		activite.setCodeSecteur((long) 234544498);
		user.setSecteurActivite(activite);
		Contribution contribution = new Contribution();
		contribution.setCodeContribution((long) 51484);
		//user.setContributions((List<Contribution>) contribution);
		SecteurGeographique secteur = new SecteurGeographique();
		secteur.setCodeSecteur((long) 5844);
		user.setSecteurGeo(secteur);
		ActiviteProfessionel activitepro = new ActiviteProfessionel();
		activitepro.setCodeActivite((long) 1445);
		user.setActivitePro(activitepro);
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}

}
