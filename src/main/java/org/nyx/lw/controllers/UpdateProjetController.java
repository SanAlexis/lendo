/**
 * 
 */
package org.nyx.lw.controllers;

import java.io.IOException;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Media;
import org.nyx.lw.entities.Projet;
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
public class UpdateProjetController {
	@Autowired
	private ILendoWalletMetier metier;

	@RequestMapping(value = "/updateprojettitre", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojettitre(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String titre = request.getParameter("titre");
		long code_projet = Long.parseLong(request.getParameter("codeu"));
		Projet p = metier.consulterProjet((long) code_projet);
		p.setTitre(titre);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetcathegorie", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetcathegorie(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		long cathegorie = Long.parseLong(request.getParameter("cathegorie"));
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		Categorie categorie = new Categorie();
		categorie.setCodeCategorie(cathegorie);
		p.setCategorie(categorie);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetslogan", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetslogan(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String slogan = request.getParameter("slogan");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setSlogan(slogan);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetdescription", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetdescription(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String description1 = request.getParameter("description1");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setDescription(description1);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetmontantAttendu", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetmontantAttendu(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String montantAttendu = request.getParameter("montantAttendu");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setMontantAttendu(Double.parseDouble(montantAttendu));
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetdureeCampagne", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetdureeCampagne(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String dureeCampagne = request.getParameter("dureeCampagne");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setDureeCampagne(Integer.parseInt(dureeCampagne));
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetpresentation", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetpresentation(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String presentation = request.getParameter("presentation");
		long code_projet = Long.parseLong(request.getParameter("code_p"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setPresentation(presentation);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetbusnessPlan", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetbusnessPlan(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String busnessPlan = request.getParameter("busnessPlan");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setBusnessPlan(busnessPlan);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetville", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetville(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String ville = request.getParameter("ville");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setVille(ville);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetpays", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetpays(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String pays = request.getParameter("pays");
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		Projet p = metier.consulterProjet((long) code_projet);
		p.setPays(pays);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetimage", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetimage(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException, IllegalStateException,
			ServletException {
		// Récupération du code de l'utilisateur
		String image = request.getParameter("image");
		long code_projet = Long.parseLong(request.getParameter("codeu"));
		Media media = new Media();
		media.setChemin(image);
		metier.addMedia(code_projet, media);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(request
				.getParameter("image"));
		return json;
	}

	@RequestMapping(value = "/updateprojetvideo", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetvideo(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String video = request.getParameter("video");
		long code_projet = Long.parseLong(request.getParameter("codeu"));
		Media media = new Media();
		media.setUrl(video);
		// media.setProjet(pro);
		metier.addMedia(code_projet, media);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetdatedebut", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetdatedebut(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		long code_projet = Long.parseLong(request.getParameter("codeu"));
		Date DateDebut = new Date();
		Projet p = metier.consulterProjet((long) code_projet);
		p.setDateDebutCampagne(DateDebut);
		metier.updateProjet(p);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/updateprojetsetcommentaire", method = RequestMethod.POST)
	public @ResponseBody
	String updateprojetsetcommentaire(HttpServletRequest request,
			HttpServletResponse response) throws JsonGenerationException,
			JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		long code_projet = Long.parseLong(request.getParameter("codeu"));
		String commentaire = request.getParameter("commentaire");

		HttpSession session = request.getSession();
		long codU = (Long) session.getAttribute("codeU");

		Projet p = new Projet();
		p.setCodeProjet(code_projet);

		Commentaire moncommentaire = new Commentaire();
		moncommentaire.setDescription(commentaire);
		moncommentaire.setDatePost(new Date());

		Utilisateur user = new Utilisateur();
		user.setCodeUtilisateur(codU);

		metier.addCommentaires(p, moncommentaire, user);

		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString("");
		return json;
	}

	@RequestMapping(value = "/deleteprojet", method = RequestMethod.POST)
	// @RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String deleteprojet(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		long code_projet = Long.parseLong(request.getParameter("codeu"));

		ObjectMapper objectMapper = new ObjectMapper();
		Projet projet = new Projet();
		projet.setCodeProjet(code_projet);
		if (metier.isFlexible(projet)) {
			ProjetFlexible p = new ProjetFlexible();
			p.setCodeProjet(code_projet);
			ProjetFlexible pro = metier.deleteProjetFlexible(p);
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(pro);
			return json;
		} else {
			ProjetBusiness p = new ProjetBusiness();
			p.setCodeProjet(code_projet);
			ProjetBusiness pro = metier.deleteProjetBusiness(p);
			// transformation de l'objet java en json
			String json = objectMapper.writeValueAsString(pro);
			return json;
		}

		
	}

}
