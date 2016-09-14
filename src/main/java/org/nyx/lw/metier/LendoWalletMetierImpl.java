package org.nyx.lw.metier;

import java.util.Date;

import org.nyx.lw.dao.ILendoWalletDao;
import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Transactional
@Service("LendoWalletMetier")
public class LendoWalletMetierImpl implements ILendoWalletMetier {
@Autowired
public ILendoWalletDao lwdao;

public void setLwdao(ILendoWalletDao lwdao) {
	this.lwdao = lwdao;
}

@Override
public void verser(double mt, Long cpte, Long codeU) {
	// TODO Auto-generated method stub
	
}

@Override
public void retirer(double mt, Long cpte, Long codeU) {
	// TODO Auto-generated method stub
	
}

@Override
public void contribuerPourProjet(double mt, Long cpteProjet, Long codeU) {
	// TODO Auto-generated method stub
	
}

@Override
public Categorie creerCategorie(Categorie cat) {
	// TODO Auto-generated method stub
	return lwdao.addCategorie(cat);
}

@Override
public Motivation creerMotivation(Motivation mot) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Operateur creerOperateur(Operateur op) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public SecteurGeographique creerSecteurGeographique(SecteurGeographique sg) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public SecteurActivite creerSecteurActivite(SecteurActivite sa) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public LendoUtilisateur creerCompteUtilisateur(LendoUtilisateur lu, Long codeU) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public LendoProjet creerCompteProjet(LendoProjet lp, Long codeP) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet creerProjetBusiness(ProjetBusiness pb, Long codU) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet creerProjetFlexible(ProjetFlexible pf, Long codU) {
	// TODO Auto-generated method stub
	return null;
}



@Override
public boolean checkLogin(String userName, String userPassword) {
	 System.out.println("In Service class...Check Login");
     return lwdao.checkLogin(userName, userPassword);
}

@Override
public Utilisateur creerUtilisateur(Utilisateur u, Long codeMot, Long codeSA,
		Long codeSG, Long codeAP) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur creerUtilisateur(String nom, String prenom, String email,
		String pass, String ville, String pays) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur addInformation(Utilisateur u, String nom, String prenom,
		Date date_nais, String lieu_naiss, String nation) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur addCoordonnee(Utilisateur u, String adresse,
		String complAdress, String codePostal, String pays, String ville,
		String telephone) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur addPreferences(Utilisateur u, Motivation mo,
		SecteurActivite sa, SecteurGeographique sg) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur addExperience(Utilisateur u, ActiviteProfessionel ap,
		String provenanceFond) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet creerProjet(String titre, Categorie cat, Double montantAttendu) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet addDescription(Projet p, String titre, Categorie cat,
		String slogan, String montantAttentdu, String description, String pays,
		String ville, String dureeProjet) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet addMedia(Projet p, Media m) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet addCommentaires(Projet p, Commentaire com, Utilisateur u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public void approvisionnerCompte(LendoWallet lw, Double montant) {
	// TODO Auto-generated method stub
	
}

@Override
public String checkEmail(String email) {
	// TODO Auto-generated method stub
	return "1";
}

}
