/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
public class UpdateUserController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateusernom",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateusernom(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String nom = request.getParameter("nom");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setNom(nom);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuserprenom",method = RequestMethod.POST)
	public @ResponseBody
	String updateuserprenom(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String prenom = request.getParameter("prenom");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setPrenom(prenom);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuserdatenaissance",method = RequestMethod.POST)
	public @ResponseBody
	String updateuserdatenaissance(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String date = request.getParameter("date");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setNom(date);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}

	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuserlieunaissance",method = RequestMethod.POST)
	public @ResponseBody
	String updateuserlieunaissance(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String lieu = request.getParameter("lieu");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(lieu);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuseradresse",method = RequestMethod.POST)
	public @ResponseBody
	String updateuseradresse(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String adresse = request.getParameter("adresse");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(adresse);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuseradresse1",method = RequestMethod.POST)
	public @ResponseBody
	String updateuseradresse1(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String adresse = request.getParameter("adresse1");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(adresse);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateusercodepostal",method = RequestMethod.POST)
	public @ResponseBody
	String updateusercodepostal(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String codepostal = request.getParameter("codepostal");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(codepostal);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateusertelephone",method = RequestMethod.POST)
	public @ResponseBody
	String updateusertelephone(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String telephone = request.getParameter("telephone");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(telephone);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateusermotivation",method = RequestMethod.POST)
	public @ResponseBody
	String updateusermotivation(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String motivation = request.getParameter("motivation");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(motivation);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuseractivite",method = RequestMethod.POST)
	public @ResponseBody
	String updateuseractivite(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String activite = request.getParameter("activite");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(activite);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateusersecteurgeo",method = RequestMethod.POST)
	public @ResponseBody
	String updateusersecteurgeo(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String secteurgeo = request.getParameter("secteurgeo");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(secteurgeo);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuseractivitepro",method = RequestMethod.POST)
	public @ResponseBody
	String updateuseractivitepro(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String activitepro = request.getParameter("activitepro");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(activitepro);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuserexperience",method = RequestMethod.POST)
	public @ResponseBody
	String updateuserexperience(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String experience = request.getParameter("experience");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(experience);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateuserrevenu",method = RequestMethod.POST)
	public @ResponseBody
	String updateuserrevenu(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String revenu = request.getParameter("revenu");
		String codeu = request.getParameter("codeu");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un utilisateur à des fins de test
		 */
		Utilisateur user = new Utilisateur();
		user.setLieuNaissance(revenu);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(user);
		return json;

	}

}
