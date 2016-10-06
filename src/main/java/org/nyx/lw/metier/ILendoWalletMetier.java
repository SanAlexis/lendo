package org.nyx.lw.metier;


import java.util.Date;

import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
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
import org.nyx.lw.entities.TypeMedia;
import org.nyx.lw.entities.Utilisateur;



public interface ILendoWalletMetier {
	
	public void verser(double mt, Long cpte, Long codeU);
	public void retirer(double mt,Long codeU);
	public void contribuerPourProjet(double mt, Long cpteProjet, Long codeU);
	public Categorie creerCategorie(Categorie cat);
	public Motivation creerMotivation(Motivation mot);
	public Operateur creerOperateur(Operateur op);
	public SecteurGeographique creerSecteurGeographique(SecteurGeographique sg);
	public SecteurActivite creerSecteurActivite(SecteurActivite sa);
	public LendoUtilisateur creerCompteUtilisateur(LendoUtilisateur lu, Long codeU);
	public LendoProjet creerCompteProjet(LendoProjet lp, Long codeP);
	//par défaut tous les projets sont busness
	public Projet creerProjetBusiness(ProjetBusiness pb, Long codU);
	public Projet creerProjetFlexible(ProjetFlexible pf, Long codU);
	public Utilisateur updateUtilisateur(Long u, Long codeMot, Long codeSA, Long codeSG,Long codeAP);
	public boolean checkLogin(String userName, String userPassword);
	public String checkEmail(String email);
	public Utilisateur creerUtilisateur(String nom, String prenom, String email, String pass,String ville, String pays);
	public Utilisateur addInformation(Utilisateur u,String nom, String prenom, Date date_nais, String lieu_naiss, String email);
	public Utilisateur addCoordonnee(Utilisateur u, String adresse, String complAdress, String codePostal,String telephone);
	public Utilisateur addPreferences(Utilisateur u, Motivation mo, SecteurActivite sa, SecteurGeographique sg);
	public Utilisateur addExperience(Utilisateur u, ActiviteProfessionel ap, String provenanceFond);
	public Projet creerProjet(String titre, Categorie cat, Double montantAttendu);
	public Projet addDescription(Projet p, String titre, Categorie cat, String slogan, String montantAttentdu, String description, String pays, String ville, String dureeProjet);
	public Media addMedia (Long p, Media m);
	public Commentaire addCommentaires(Projet p, Commentaire com, Utilisateur u);
	public Projet faireDon(Projet P,Don d, Utilisateur u);
	public Projet faireDette(Projet P,Dette d, Utilisateur u);
	public void approvisionnerCompte(LendoWallet lw, Double montant);
	void crediter(double mt, Long codeU);
}
