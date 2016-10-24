package org.nyx.lw.controllers;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Contribution;
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
public class ConsulterProjetController {

	@Autowired
	private ILendoWalletMetier metier;

	@SuppressWarnings("unused")
	@RequestMapping(value = "/consulterprojet", method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojet(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code du projet
		Long codeP = Long.parseLong(request.getParameter("codeP"));
		String codeU = request.getParameter("codeU");
		
		Projet projet1 =  metier.consulterProjet(codeP);
		Projet projet = new Projet();
		projet.setCodeProjet(projet1.getCodeProjet());
		projet.setTitre(projet1.getTitre());
		Categorie categorie = new Categorie();
		categorie.setCodeCategorie(projet1.getCategorie().getCodeCategorie());
		categorie.setLibelle(projet1.getCategorie().getLibelle());
		projet.setCategorie(categorie);
		projet.setSlogan(projet1.getSlogan());
		projet.setDescription(projet1.getDescription());
		projet.setPresentation(projet1.getPresentation());
		projet.setMontantAttendu(projet1.getMontantAttendu());
		projet.setDureeCampagne(projet1.getDureeCampagne());
		projet.setDateDebutCampagne(projet1.getDateDebutCampagne());
		projet.setVille(projet1.getVille());
		projet.setPays(projet1.getPays());
		projet.setBusnessPlan(projet1.getBusnessPlan());
		List <Media> media = metier.getMediaByProjet(codeP);
		List <Media> medias =  new LinkedList<Media>();
		for(int i=0; i< media.size(); i++){
			Long code = media.get(i).getCodeMedia();
			String chemin = media.get(i).getChemin();
			String description = media.get(i).getDescription();
			String Url = media.get(i).getUrl();
			Media media1 = new Media();
			media1.setCodeMedia(code);
			media1.setChemin(chemin);
			media1.setDescription(description);
			media1.setUrl(Url);
			medias.add(media1);
		}
		projet.setMedias(medias);
		
		List <Commentaire> commentaires =  new LinkedList<Commentaire>();
		Commentaire commentaire = new Commentaire();
		commentaires.add(commentaire);
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;

	}
	
	@RequestMapping(value = "/consulterprojetcomplet", method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetcomplet(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException, ParseException {
		// Récupération du code du projet
		Long codeP = Long.parseLong(request.getParameter("codeP"));
		
		ObjectMapper objectMapper = new ObjectMapper();
		Projet p = metier.consulterProjet(codeP);
		if(p.getCodeProjet()!=null){
			boolean type = metier.isFlexible(p);
			if(type){
				ProjetFlexible projet0 = metier.consulterProjetFlexible(codeP);
				ProjetFlexible projet = new ProjetFlexible();
				projet.setCodeProjet(projet0.getCodeProjet());
				projet.setTitre(projet0.getTitre());
				projet.setDescription(projet0.getDescription());
				projet.setMontantAttendu(projet0.getMontantAttendu());
				projet.setSlogan(projet0.getSlogan());
				projet.setVille(projet0.getVille());
				projet.setPays(projet0.getPays());
				projet.setDureeCampagne(projet0.getDureeCampagne());
				projet.setBusnessPlan(projet0.getBusnessPlan());
				projet.setPresentation(projet0.getPresentation());
				projet.setDateCreation(projet0.getDateCreation());
				projet.setDateDebutCampagne(projet0.getDateDebutCampagne());
				projet.setTaux(projet0.getTaux());
				projet.setTypeProjet("don");;
				
				Categorie categorie = new Categorie();
				categorie.setCodeCategorie(projet0.getCategorie().getCodeCategorie());
				categorie.setLibelle(projet0.getCategorie().getLibelle());
				projet.setCategorie(categorie);
				
				
				
				List <Media> media = metier.getMediaByProjet(codeP);
				List <Media> medias =  new LinkedList<Media>();
				for(int j=0; j< media.size(); j++){
					Long codem = media.get(j).getCodeMedia();
					String chemin = media.get(j).getChemin();
					String descriptionm = media.get(j).getDescription();
					String Url = media.get(j).getUrl();
					Media media1 = new Media();
					media1.setCodeMedia(codem);
					media1.setChemin(chemin);
					media1.setDescription(descriptionm);
					media1.setUrl(Url);
					medias.add(media1);
				}
				projet.setMedias(medias);
				
				Utilisateur user = new Utilisateur();
				user.setCodeUtilisateur(projet0.getPromoteur().getCodeUtilisateur());
				user.setNom(projet0.getPromoteur().getNom());
				user.setPrenom(projet0.getPromoteur().getPrenom());
				projet.setPromoteur(user);
				
				List <Commentaire> commentaire = metier.getCommentaireProjet(codeP);
				List <Commentaire> commentaires =  new LinkedList<Commentaire>();
				for (int i=0; i<commentaire.size(); i++){
					Commentaire co = new Commentaire();
					co.setCodeCommentaire(commentaire.get(i).getCodeCommentaire());
					co.setDatePost(commentaire.get(i).getDatePost());
					co.setTitre(commentaire.get(i).getTitre());
					co.setDescription(commentaire.get(i).getDescription());
					
					Utilisateur u = new Utilisateur();
					u.setCodeUtilisateur(commentaire.get(i).getUtilisateur().getCodeUtilisateur());
					u.setNom(commentaire.get(i).getUtilisateur().getNom());
					u.setPrenom(commentaire.get(i).getUtilisateur().getPrenom());
					
					co.setUtilisateur(u);

					commentaires.add(co);
				}
				projet.setCommentaires(commentaires);
				
				List<Contribution> contribution = metier.getContributionProjet(codeP);
				List<Contribution> contributions = new LinkedList<Contribution>();
				for (int k=0; k<contribution.size(); k++){
					Contribution con = new Contribution();
					con.setCodeContribution(contribution.get(k).getCodeContribution());
					con.setMontant(contribution.get(k).getMontant());
					con.setDateVersement(contribution.get(k).getDateVersement());
					
					Utilisateur us = new Utilisateur();
					us.setCodeUtilisateur(contribution.get(k).getUtilisateur().getCodeUtilisateur());
					us.setNom(contribution.get(k).getUtilisateur().getNom());
					us.setPrenom(contribution.get(k).getUtilisateur().getPrenom());
					
					con.setUtilisateur(us);
					
					contributions.add(con);
					
				}
				projet.setContributions(contributions);
				
				
				String json = objectMapper.writeValueAsString(projet);
				return json;
			}else{
				ProjetBusiness projet0 = metier.consulterProjetBusiness(codeP);
				ProjetBusiness projet = new ProjetBusiness();
				
				projet.setCodeProjet(projet0.getCodeProjet());
				projet.setTitre(projet0.getTitre());
				projet.setDescription(projet0.getDescription());
				projet.setMontantAttendu(projet0.getMontantAttendu());
				projet.setSlogan(projet0.getSlogan());
				projet.setVille(projet0.getVille());
				projet.setPays(projet0.getPays());
				projet.setDureeCampagne(projet0.getDureeCampagne());
				projet.setBusnessPlan(projet0.getBusnessPlan());
				projet.setPresentation(projet0.getPresentation());
				projet.setDateCreation(projet0.getDateCreation());
				projet.setDateDebutCampagne(projet0.getDateDebutCampagne());
				projet.setTauxFixe(projet0.getTauxFixe());
				projet.setTypeProjet("pret");
				projet.setDateRemboursement(projet0.getDateRemboursement());
				Categorie categorie = new Categorie();
				categorie.setCodeCategorie(projet0.getCategorie().getCodeCategorie());
				categorie.setLibelle(projet0.getCategorie().getLibelle());
				projet.setCategorie(categorie);
				
				
				
				List <Media> media = metier.getMediaByProjet(codeP);
				List <Media> medias =  new LinkedList<Media>();
				for(int j=0; j< media.size(); j++){
					Long codem = media.get(j).getCodeMedia();
					String chemin = media.get(j).getChemin();
					String descriptionm = media.get(j).getDescription();
					String Url = media.get(j).getUrl();
					Media media1 = new Media();
					media1.setCodeMedia(codem);
					media1.setChemin(chemin);
					media1.setDescription(descriptionm);
					media1.setUrl(Url);
					medias.add(media1);
				}
				projet.setMedias(medias);
				
				Utilisateur user = new Utilisateur();
				user.setCodeUtilisateur(projet0.getPromoteur().getCodeUtilisateur());
				user.setNom(projet0.getPromoteur().getNom());
				user.setPrenom(projet0.getPromoteur().getPrenom());
				projet.setPromoteur(user);
				
				List <Commentaire> commentaire = metier.getCommentaireProjet(codeP);
				List <Commentaire> commentaires =  new LinkedList<Commentaire>();
				for (int i=0; i<commentaire.size(); i++){
					Commentaire co = new Commentaire();
					co.setCodeCommentaire(commentaire.get(i).getCodeCommentaire());
					co.setDatePost(commentaire.get(i).getDatePost());
					co.setTitre(commentaire.get(i).getTitre());
					co.setDescription(commentaire.get(i).getDescription());
					
					Utilisateur u = new Utilisateur();
					u.setCodeUtilisateur(commentaire.get(i).getUtilisateur().getCodeUtilisateur());
					u.setNom(commentaire.get(i).getUtilisateur().getNom());
					u.setPrenom(commentaire.get(i).getUtilisateur().getPrenom());
					
					co.setUtilisateur(u);

					commentaires.add(co);
				}
				projet.setCommentaires(commentaires);
				
				List<Contribution> contribution = metier.getContributionProjet(codeP);
				List<Contribution> contributions = new LinkedList<Contribution>();
				for (int k=0; k<contribution.size(); k++){
					Contribution con = new Contribution();
					con.setCodeContribution(contribution.get(k).getCodeContribution());
					con.setMontant(contribution.get(k).getMontant());
					con.setDateVersement(contribution.get(k).getDateVersement());
					
					Utilisateur us = new Utilisateur();
					us.setCodeUtilisateur(contribution.get(k).getUtilisateur().getCodeUtilisateur());
					us.setNom(contribution.get(k).getUtilisateur().getNom());
					us.setPrenom(contribution.get(k).getUtilisateur().getPrenom());
					
					con.setUtilisateur(us);
					
					contributions.add(con);
					
				}
				projet.setContributions(contributions);
				
				String json = objectMapper.writeValueAsString(projet);
				return json;
			}
		}else{
			String json = objectMapper.writeValueAsString(p);
			return json;
		}

	}
	
	@RequestMapping(value = "/consulterprojetbytitre",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetbytitre(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		// Récupération du code de l'utilisateur
		String titre = request.getParameter("titre");
		List<Projet> projets= metier.consulterProjets(titre);
		List <Projet> projet =  new LinkedList<Projet>();
		for(int i=0; i< projets.size(); i++){
			Long code = projets.get(i).getCodeProjet();
			String titrep = projets.get(i).getTitre();
			Projet p = new Projet();
			p.setCodeProjet(code);
			p.setTitre(titrep);
			projet.add(p);
		}
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	
	@RequestMapping(value = "/consulterprojetallprojet",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetallprojet(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		List<Projet> projets= metier.getProjet();
		List <Projet> projet =  new LinkedList<Projet>();
		for(int i=0; i< projets.size(); i++){
			if(projets.get(i).getDateDebutCampagne()!=null){

				Long code = projets.get(i).getCodeProjet();
				String titrep = projets.get(i).getTitre();
				String description = projets.get(i).getDescription();
				Categorie categorie = new Categorie();
				categorie.setCodeCategorie(projets.get(i).getCategorie().getCodeCategorie());
				categorie.setLibelle(projets.get(i).getCategorie().getLibelle());
				
				List <Media> media = metier.getMediaByProjet(code);
				List <Media> medias =  new LinkedList<Media>();
				for(int j=0; j< media.size(); j++){
					Long codem = media.get(j).getCodeMedia();
					String chemin = media.get(j).getChemin();
					String descriptionm = media.get(j).getDescription();
					String Url = media.get(j).getUrl();
					Media media1 = new Media();
					media1.setCodeMedia(codem);
					media1.setChemin(chemin);
					media1.setDescription(descriptionm);
					media1.setUrl(Url);
					medias.add(media1);
				}
				
				List<Contribution> contribution = metier.getContributionProjet(projets.get(i).getCodeProjet());
				List<Contribution> contributions = new LinkedList<Contribution>();
				for (int k=0; k<contribution.size(); k++){
					Contribution con = new Contribution();
					con.setCodeContribution(contribution.get(k).getCodeContribution());
					con.setMontant(contribution.get(k).getMontant());
					con.setDateVersement(contribution.get(k).getDateVersement());
					
					Utilisateur us = new Utilisateur();
					us.setCodeUtilisateur(contribution.get(k).getUtilisateur().getCodeUtilisateur());
					us.setNom(contribution.get(k).getUtilisateur().getNom());
					us.setPrenom(contribution.get(k).getUtilisateur().getPrenom());
					
					con.setUtilisateur(us);
					
					contributions.add(con);
					
				}
				
				
				Projet p = new Projet();
				p.setCodeProjet(code);
				p.setTitre(titrep);
				p.setCategorie(categorie);
				p.setDescription(description);
				p.setDateDebutCampagne(projets.get(i).getDateDebutCampagne());
				p.setDureeCampagne(projets.get(i).getDureeCampagne());
				p.setMedias(medias);
				p.setMontantAttendu(projets.get(i).getMontantAttendu());
				p.setContributions(contributions);
				p.setVille(projets.get(i).getVille());
				p.setPays(projets.get(i).getPays());
				projet.add(p);
			}
		}
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	
	
	
	@RequestMapping(value = "/consulterprojetbycategorie",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetbycategorie(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		long cat = Long.parseLong(request.getParameter("categorie"));
		List<Projet> projets= metier.getProjetByCategorie(cat);
		List <Projet> projet =  new LinkedList<Projet>();
		for(int i=0; i< projets.size(); i++){
			if(projets.get(i).getDateDebutCampagne()!=null){
				Long code = projets.get(i).getCodeProjet();
				String titrep = projets.get(i).getTitre();
				String description = projets.get(i).getDescription();
				Categorie categorie = new Categorie();
				categorie.setCodeCategorie(projets.get(i).getCategorie().getCodeCategorie());
				categorie.setLibelle(projets.get(i).getCategorie().getLibelle());
				
				List <Media> media = metier.getMediaByProjet(code);
				List <Media> medias =  new LinkedList<Media>();
				for(int j=0; j< media.size(); j++){
					Long codem = media.get(j).getCodeMedia();
					String chemin = media.get(j).getChemin();
					String descriptionm = media.get(j).getDescription();
					String Url = media.get(j).getUrl();
					Media media1 = new Media();
					media1.setCodeMedia(codem);
					media1.setChemin(chemin);
					media1.setDescription(descriptionm);
					media1.setUrl(Url);
					medias.add(media1);
				}
				
				List<Contribution> contribution = metier.getContributionProjet(projets.get(i).getCodeProjet());
				List<Contribution> contributions = new LinkedList<Contribution>();
				for (int k=0; k<contribution.size(); k++){
					Contribution con = new Contribution();
					con.setCodeContribution(contribution.get(k).getCodeContribution());
					con.setMontant(contribution.get(k).getMontant());
					con.setDateVersement(contribution.get(k).getDateVersement());
					
					Utilisateur us = new Utilisateur();
					us.setCodeUtilisateur(contribution.get(k).getUtilisateur().getCodeUtilisateur());
					us.setNom(contribution.get(k).getUtilisateur().getNom());
					us.setPrenom(contribution.get(k).getUtilisateur().getPrenom());
					
					con.setUtilisateur(us);
					
					contributions.add(con);
					
				}
				
				Projet p = new Projet();
				p.setCodeProjet(code);
				p.setTitre(titrep);
				p.setCategorie(categorie);
				p.setDescription(description);
				p.setDateDebutCampagne(projets.get(i).getDateDebutCampagne());
				p.setDureeCampagne(projets.get(i).getDureeCampagne());
				p.setMedias(medias);
				p.setMontantAttendu(projets.get(i).getMontantAttendu());
				p.setContributions(contributions);
				p.setVille(projets.get(i).getVille());
				p.setPays(projets.get(i).getPays());
				projet.add(p);
			}
		}
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	
	@RequestMapping(value = "/consulterprojetcommentaires",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetcommentaires(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		
		Long codeP = Long.parseLong(request.getParameter("codeP"));
		
		Projet projet = new Projet();
		List <Commentaire> commentaire = metier.getCommentaireProjet(codeP);
		List <Commentaire> commentaires =  new LinkedList<Commentaire>();
		for (int i=0; i<commentaire.size(); i++){
			Commentaire co = new Commentaire();
			co.setCodeCommentaire(commentaire.get(i).getCodeCommentaire());
			co.setDatePost(commentaire.get(i).getDatePost());
			co.setTitre(commentaire.get(i).getTitre());
			co.setDescription(commentaire.get(i).getDescription());
			
			Utilisateur u = new Utilisateur();
			u.setCodeUtilisateur(commentaire.get(i).getUtilisateur().getCodeUtilisateur());
			u.setNom(commentaire.get(i).getUtilisateur().getNom());
			u.setPrenom(commentaire.get(i).getUtilisateur().getPrenom());
			
			co.setUtilisateur(u);

			commentaires.add(co);
		}
		projet.setCommentaires(commentaires);
		
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
	
	@RequestMapping(value = "/consulterprojetcontributions",method = RequestMethod.POST)
	//@RequestMapping(method = RequestMethod.POST)
	public @ResponseBody
	String consulterprojetcontributions(HttpServletRequest request, HttpServletResponse response)
			throws JsonGenerationException, JsonMappingException, IOException {
		
		Long codeP = Long.parseLong(request.getParameter("codeP"));
		
		Projet projet = new Projet();
		List<Contribution> contribution = metier.getContributionProjet(codeP);
		List<Contribution> contributions = new LinkedList<Contribution>();
		for (int k=0; k<contribution.size(); k++){
			Contribution con = new Contribution();
			con.setCodeContribution(contribution.get(k).getCodeContribution());
			con.setMontant(contribution.get(k).getMontant());
			con.setDateVersement(contribution.get(k).getDateVersement());
			
			Utilisateur us = new Utilisateur();
			us.setCodeUtilisateur(contribution.get(k).getUtilisateur().getCodeUtilisateur());
			us.setNom(contribution.get(k).getUtilisateur().getNom());
			us.setPrenom(contribution.get(k).getUtilisateur().getPrenom());
			
			con.setUtilisateur(us);
			
			contributions.add(con);
			
		}
		projet.setContributions(contributions);
		
		Projet p = metier.consulterProjet(codeP);
		projet.setMontantAttendu(p.getMontantAttendu());
		
		ObjectMapper objectMapper = new ObjectMapper();
		// transformation de l'objet java en json
		String json = objectMapper.writeValueAsString(projet);
		return json;
	}
}
