/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

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
public class UpdateProjetController {
	@Autowired
	private ILendoWalletMetier metier;
	
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojettitre",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojettitre(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String titre = request.getParameter("titre");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetcathegorie",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetcathegorie(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String cathegorie = request.getParameter("cathegorie");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetslogan",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetslogan(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String slogan = request.getParameter("slogan");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetdescription",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetdescription(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String description1 = request.getParameter("description1");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetmontantAttendu",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetmontantAttendu(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String montantAttendu = request.getParameter("montantAttendu");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetdureeCampagne",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetdureeCampagne(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String dureeCampagne = request.getParameter("dureeCampagne");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetpresentation",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetpresentation(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String presentation = request.getParameter("presentation");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetbusnessPlan",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetbusnessPlan(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String busnessPlan = request.getParameter("busnessPlan");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetville",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetville(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String ville = request.getParameter("ville");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetpays",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetpays(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String pays = request.getParameter("pays");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetimage",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetimage(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException, IllegalStateException, ServletException {
		// Récupération du code de l'utilisateur
		String image = request.getParameter("a");
		String imageName = request.getParameter("blobName");
		String code_projet = request.getParameter("blobType");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(image);
		return json;
	}
	@SuppressWarnings("unused")
	@RequestMapping(value = "/updateprojetvideo",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetvideo(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String video = request.getParameter("video");
		String code_projet = request.getParameter("code_projet");
		/*
		 * Fonction permettant de récupérer les informations sur l'utilisateur
		 * dans la BD
		 */

		/*
		 * initialisation d'un Projet à des fins de test
		 * à supprimer
		 */
		ProjetBusiness projet = new ProjetBusiness();
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}

	
	
}
