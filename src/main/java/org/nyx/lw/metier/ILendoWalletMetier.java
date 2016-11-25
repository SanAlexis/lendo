package org.nyx.lw.metier;


import java.util.Date;
import java.util.List;

import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Contribution;
import org.nyx.lw.entities.Dette;
import org.nyx.lw.entities.Don;
import org.nyx.lw.entities.LendoProjet;
import org.nyx.lw.entities.LendoUtilisateur;
import org.nyx.lw.entities.LendoWallet;
import org.nyx.lw.entities.Media;
import org.nyx.lw.entities.Motivation;
import org.nyx.lw.entities.Operateur;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.entities.ProjetFlexible;
import org.nyx.lw.entities.SecteurActivite;
import org.nyx.lw.entities.SecteurGeographique;
import org.nyx.lw.entities.Utilisateur;



public interface ILendoWalletMetier {
	public Projet creerProjet(Projet p);
	public ProjetFlexible creerProjetFlexible(ProjetFlexible pf);
	public ProjetBusiness creerProjetBusiness(ProjetBusiness pb);
	public Utilisateur creerUtilisateur(Utilisateur U);
	public void verser(double mt, Long cpte, Long codeU);
	public void retirer(double mt,Long codeU);
	public void contribuerPourProjet(double mt, Long cpteProjet, Long codeU);
	public Categorie creerCategorie(Categorie cat);
	public Motivation creerMotivation(Motivation mot);
	public Commentaire creerCommentaire(Commentaire c);
	public Operateur creerOperateur(Operateur op);
	public SecteurGeographique creerSecteurGeographique(SecteurGeographique sg);
	public SecteurActivite creerSecteurActivite(SecteurActivite sa);
	public LendoUtilisateur creerCompteUtilisateur(LendoUtilisateur lu, Long codeU);
	public LendoProjet creerCompteProjet(LendoProjet lp, Long codeP);
	public void deleteMedia(Media m);
	//par d�faut tous les projets sont busness
	public Projet creerProjetBusiness(ProjetBusiness pb, Long codU);
	public Projet creerProjetBusiness(ProjetBusiness pb, Long codU, Long codeCat);
	public Projet creerProjetFlexible(ProjetFlexible pf, Long codU);
	public Projet creerProjetFlexible(ProjetFlexible pf, Long codU, Long codeCat);
	public Utilisateur updateUtilisateur(Long u, Long codeMot, Long codeSA, Long codeSG,Long codeAP);
	public Utilisateur updateUtilisateur(Utilisateur u);
	public Projet updateProjet(Projet p);
	public Projet deleteProjet(Projet p);
	public ProjetFlexible deleteProjetFlexible(ProjetFlexible pf);
	public ProjetBusiness deleteProjetBusiness(ProjetBusiness pb);
	public boolean checkLogin(String userName, String userPassword);
	public Utilisateur checkUser(String userName, String userPassword);
	public boolean checkEmail(String email);
	public Utilisateur creerUtilisateur(String nom, String prenom, String email, String pass,String ville, String pays);
	public Utilisateur addInformation(Utilisateur u,String nom, String prenom, Date date_nais, String lieu_naiss, String email);
	public Utilisateur addCoordonnee(Utilisateur u, String adresse, String complAdress, String codePostal,String telephone);
	public Utilisateur addPreferences(Utilisateur u, Motivation mo, SecteurActivite sa, SecteurGeographique sg);
	public Utilisateur addExperience(Utilisateur u, ActiviteProfessionel ap, String provenanceFond);
	public Projet addDescription(Projet p, String titre, Categorie cat, String slogan, double montantAttentdu, String description, String pays, String ville, int dureeProjet);
	public Media addMedia (Long p, Media m);
	public Commentaire addCommentaires(Projet p, Commentaire com, Utilisateur u);
	public Projet faireDon(Projet P,Don d, Utilisateur u);
	public Projet faireDette(Projet P,Dette d, Utilisateur u);
	public void faireDon(Don d);
	public void faireDette(Dette d);
	public void approvisionnerCompte(LendoWallet lw, Double montant);
	void crediter(double mt, Long codeU);
	
	public List<Projet> getProjetUtilisateur(Long codeU);
	public List<Categorie> getCategories();
	public List<Contribution> getContributionProjetUtilisateur(Long codeU);
	public List<Motivation>getMotivations();
	public List<SecteurActivite> getSecteurActivites();
	public List<SecteurGeographique> getSecteurGeos();
	public List<Commentaire> getCommentaireProjet(Long codeP);
	public List<Contribution> getContributionProjet(Long codeP);
	public List<Media> getMediaByProjet(Long codeP);
	public Boolean isYour(Projet P, Utilisateur U);
	public Projet consulterProjet(Long codeP);
	public Utilisateur consulterUtilisateur(Long codeU);
	public ProjetBusiness updateProjetBusiness(ProjetBusiness pb);
	public ProjetFlexible updateProjetFlexible(ProjetFlexible pf);
	public boolean isDon(Contribution c);
	public boolean isFlexible(Projet p);
	public ProjetFlexible consulterProjetFlexible(Long codeProjet);
	public ProjetBusiness consulterProjetBusiness(Long codeProjet);
	public List<Projet> getProjet();
	public List<Projet> consulterProjets(String titre);
	public List<Projet> getProjetByCategorie(Long codeCat);
	public boolean checkTitre(String titre);
	public void delete(Commentaire c);
}
