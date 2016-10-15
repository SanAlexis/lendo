package org.nyx.lw.metier;

import java.util.Date;
import java.util.List;

import org.nyx.lw.dao.ILendoWalletDao;
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
import org.nyx.lw.entities.Retrait;
import org.nyx.lw.entities.SecteurActivite;
import org.nyx.lw.entities.SecteurGeographique;
import org.nyx.lw.entities.Utilisateur;
import org.nyx.lw.entities.Versement;
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
	Utilisateur ut=lwdao.consulterUtilisateur(codeU);
	LendoUtilisateur lu=(LendoUtilisateur)ut.getLendoutilisateur().get(0);
	LendoWallet lw1=lwdao.consulterCompte(cpte);
	lwdao.addOperation(new Versement(mt, new Date(), ut, lw1));
	lwdao.addOperation(new Retrait(mt, new Date(), ut, lu));
	lw1.setSolde(lw1.getSolde()+mt);
	lu.setSolde(lu.getSolde()-mt);
}

@Override
public void retirer(double mt,Long codeU) {
	// TODO Auto-generated method stub
	Utilisateur ut=lwdao.consulterUtilisateur(codeU);
	LendoUtilisateur lu=(LendoUtilisateur)ut.getLendoutilisateur().get(0);
	lwdao.addOperation(new Retrait(mt, new Date(), ut, lu));
	lu.setSolde(lu.getSolde()-mt);
}

@Override
public void crediter(double mt,Long codeU) {
	// TODO Auto-generated method stub
	Utilisateur ut=lwdao.consulterUtilisateur(codeU);
	LendoUtilisateur lu=(LendoUtilisateur)ut.getLendoutilisateur().get(0);
	lwdao.addOperation(new Versement(mt, new Date(), ut, lu));
	lu.setSolde(lu.getSolde()+mt);
}
@Override
public void contribuerPourProjet(double mt, Long cpteProjet, Long codeU) {
	// TODO Auto-generated method stub
	verser(mt, cpteProjet, codeU);
}

@Override
public Categorie creerCategorie(Categorie cat) {
	// TODO Auto-generated method stub
	return lwdao.addCategorie(cat);
}

@Override
public Motivation creerMotivation(Motivation mot) {
	// TODO Auto-generated method stub
	return lwdao.addMotivation(mot);
}

@Override
public Operateur creerOperateur(Operateur op) {
	// TODO Auto-generated method stub
	return lwdao.addOperateur(op);
}

@Override
public SecteurGeographique creerSecteurGeographique(SecteurGeographique sg) {
	// TODO Auto-generated method stub
	return lwdao.addSecteurGeo(sg);
}

@Override
public SecteurActivite creerSecteurActivite(SecteurActivite sa) {
	// TODO Auto-generated method stub
	return lwdao.addSecteurActivite(sa);
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
	pb.setPromoteur(lwdao.consulterUtilisateur(codU));
	return lwdao.addProjetBusiness(pb);
}

@Override
public Projet creerProjetFlexible(ProjetFlexible pf, Long codU) {
	// TODO Auto-generated method stub
	pf.setPromoteur(lwdao.consulterUtilisateur(codU));
	return lwdao.addProjetFlexible(pf);
}



@Override
public boolean checkLogin(String userName, String userPassword) {
	 System.out.println("In Service class...Check Login");
     return lwdao.checkLogin(userName, userPassword);
}

@Override
public Utilisateur updateUtilisateur(Long codeU, Long codeMot, Long codeSA,
		Long codeSG, Long codeAP) {
	Utilisateur us=lwdao.consulterUtilisateur(codeU);
	Motivation mot=lwdao.consulterMotivation(codeMot);
	SecteurActivite sa=lwdao.consulterSecteurActi(codeSA);
	SecteurGeographique sg=lwdao.consulterSecteurGeo(codeSG);
	ActiviteProfessionel ap=lwdao.consulterActivitePro(codeAP);
	us.setActivitePro(ap);
	us.setSecteurActivite(sa);
	us.setSecteurGeo(sg);
	us.setMotivation(mot);
	lwdao.editUtilisateur(us);
	return us;
}

@Override
public Utilisateur creerUtilisateur(String nom, String prenom, String email,
		String pass, String ville, String pays) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Utilisateur addInformation(Utilisateur u, String nom, String prenom,
		Date date_nais, String lieu_naiss, String email) {
	u.setNom(nom);
	u.setPrenom(prenom);
	u.setDateNaissance(date_nais);
	u.setLieuNaissance(lieu_naiss);
	u.setEmail(email);
	lwdao.editUtilisateur(u);
	return u;
}

@Override
public Utilisateur addCoordonnee(Utilisateur u, String adresse,
		String complAdress, String codePostal,String telephone) {
	u.setAdresse(adresse);
	u.setAdresse2(complAdress);
	u.setCodePostal(codePostal);
	u.setTelephone(telephone);
	lwdao.editUtilisateur(u);
	return u;
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
public Media addMedia(Long codePr, Media m) {
	// TODO Auto-generated method stub
	return lwdao.addMediaProjet(m,codePr);
}

@Override
public Commentaire addCommentaires(Projet p, Commentaire com, Utilisateur u) {
	// TODO Auto-generated method stub
	com.setProjet(p);
	com.setUtilisateur(u);
	lwdao.addCommentaire(com);
	return lwdao.addCommentaire(com);
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

@Override
public Projet faireDon(Projet P, Don d, Utilisateur u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet faireDette(Projet P, Dette d, Utilisateur u) {
	// TODO Auto-generated method stub
	return null;
}

@Override
public Projet creerProjet(Projet p) {
	// TODO Auto-generated method stub
	return lwdao.addProjet(p);
}

@Override
public Utilisateur creerUtilisateur(Utilisateur u) {
	// TODO Auto-generated method stub
	return lwdao.addUtilisateur(u);
	
}

@Override
public List<Projet> getProjetUtilisateur(Long codeU) {
	// TODO Auto-generated method stub
	return lwdao.getProjetUtilisateur(codeU);
}

@Override
public List<Categorie> getCategories() {
	// TODO Auto-generated method stub
	return lwdao.getCategories();
}

@Override
public List<Contribution> getContributionProjetUtilisateur(Long codeU) {
	// TODO Auto-generated method stub
	return lwdao.getContributionProjetUtilisateur(codeU);
}

@Override
public List<Motivation> getMotivations() {
	// TODO Auto-generated method stub
	return lwdao.getMotivations();
}

@Override
public List<SecteurActivite> getSecteurActivites() {
	// TODO Auto-generated method stub
	return lwdao.getSecteurActivites();
}

@Override
public List<SecteurGeographique> getSecteurGeos() {
	// TODO Auto-generated method stub
	return lwdao.getSecteurGeos();
}

@Override
public List<Commentaire> getCommentaireProjet(Long codeP) {
	// TODO Auto-generated method stub
	return lwdao.getCommentaireProjet(codeP);
}

@Override
public List<Contribution> getContributionProjet(Long codeP) {
	// TODO Auto-generated method stub
	return lwdao.getContributionProjet(codeP);
}

@Override
public Boolean isYour(Projet P, Utilisateur U) {
	// TODO Auto-generated method stub
	return lwdao.isYour(P, U);
}

@Override
public Projet consulterProjet(Long codeP) {
	// TODO Auto-generated method stub
	return lwdao.consulterProjet(codeP);
}

@Override
public Utilisateur consulterUtilisateur(Long codeU) {
	// TODO Auto-generated method stub
	return lwdao.consulterUtilisateur(codeU);
}

@Override
public Commentaire creerCommentaire(Commentaire c) {
	// TODO Auto-generated method stub
	return lwdao.addCommentaire(c);
}

@Override
public Utilisateur checkUser(String userName, String userPassword) {
	// TODO Auto-generated method stub
	return lwdao.checkUser(userName, userPassword);
}

@Override
public ProjetFlexible creerProjetFlexible(ProjetFlexible pf) {
	// TODO Auto-generated method stub
	return lwdao.addProjetFlexible(pf);
}

@Override
public ProjetBusiness creerProjetBusiness(ProjetBusiness pb) {
	// TODO Auto-generated method stub
	return lwdao.addProjetBusiness(pb);
}

@Override
public Projet creerProjetBusiness(ProjetBusiness pb, Long codU, Long codeCat) {
	// TODO Auto-generated method stub
	pb.setCategorie(lwdao.consulterCategorie(codeCat));
	pb.setPromoteur(lwdao.consulterUtilisateur(codU));
	return lwdao.addProjetBusiness(pb);
}

@Override
public Projet creerProjetFlexible(ProjetFlexible pf, Long codU, Long codeCat) {
	// TODO Auto-generated method stub
	pf.setCategorie(lwdao.consulterCategorie(codeCat));
	pf.setPromoteur(lwdao.consulterUtilisateur(codU));
	return lwdao.addProjetFlexible(pf);
}



}
