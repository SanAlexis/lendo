package org.nyx.lw.dao;

import java.util.List;

import org.nyx.lw.entities.ActiviteProfessionel;
import org.nyx.lw.entities.Categorie;
import org.nyx.lw.entities.Commentaire;
import org.nyx.lw.entities.Contribution;
import org.nyx.lw.entities.LendoProjet;
import org.nyx.lw.entities.LendoUtilisateur;
import org.nyx.lw.entities.LendoWallet;
import org.nyx.lw.entities.Media;
import org.nyx.lw.entities.Motivation;
import org.nyx.lw.entities.Operateur;
import org.nyx.lw.entities.Operation;
import org.nyx.lw.entities.Projet;
import org.nyx.lw.entities.ProjetBusiness;
import org.nyx.lw.entities.ProjetFlexible;
import org.nyx.lw.entities.SecteurActivite;
import org.nyx.lw.entities.SecteurGeographique;
import org.nyx.lw.entities.TypeMedia;
import org.nyx.lw.entities.Utilisateur;

public interface ILendoWalletDao {
	public Utilisateur addUtilisateur(Utilisateur u);
	public Projet addProjet(Projet p);
	public ProjetBusiness addProjetBusiness(ProjetBusiness pb);
	public ProjetFlexible addProjetFlexible(ProjetFlexible pf);
	public Commentaire addCommentaire(Commentaire c);
	public Contribution addContribution(Contribution c);
	public LendoWallet addLendowallet(LendoWallet lw);
	public Media addMedia(Media m);
	public Motivation addMotivation(Motivation m);
	public Operation addOperation(Operation op);
	public TypeMedia addTypeMedia(TypeMedia tm);
	public Categorie addCategorie(Categorie c);
	public Operateur addOperateur(Operateur op);
	public SecteurGeographique addSecteurGeo(SecteurGeographique sg);
	public ActiviteProfessionel addActivitePro(ActiviteProfessionel ap);
	public SecteurActivite addSecteurActivite(SecteurActivite sa);
	
	public Projet consulterProjet(Long codeProjet);
	public Utilisateur consulterUtilisateur(Long codeU);
	public LendoWallet consulterCompte(Long numeroC);
	public Operateur consulterOperateur(Long codeOperateur);
	public Motivation consulterMotivation(Long codeMotivation);
	public Categorie consulterCategorie(Long codeCat);
	public SecteurActivite consulterSecteurActi(Long codeSect);
	public SecteurGeographique consulterSecteurGeo(Long codeSect);
	public TypeMedia consulterTypeMedia(Long codeType);
	public List<Projet> consulterProjets(String titre);
	public LendoProjet getCompteByProjet(Long codeProjet);
	public LendoUtilisateur getCompteByUtilisateur(Long codeUser);
	public List<Media> addMediaToProject(Long codeM, Long codeP);

	public List<Operation> getOperationByLendoWallet(Long numeroLendo);
	public List<ActiviteProfessionel> getActiviteProByUtilisateur(Long codeU);
	public List<Projet> getProjetByCategorie(Long codeCat);
	public List<Media> getMediaByProject(Long codeProjet);
	public List<Categorie> getCaterogie();
	public boolean checkLogin(String email, String password);
	public Utilisateur checkUser(String email, String password);
	public Media addMediaProjet(Media m, Long p);
	public Utilisateur editUtilisateur(Utilisateur u);
	public Utilisateur deleteUtilisateur(Utilisateur u);
	public ActiviteProfessionel consulterActivitePro(Long codeAct);
	
	public List<Projet> getProjetUtilisateur(Long codeU);
	public List<Categorie> getCategories();
	public List<Contribution> getContributionProjetUtilisateur(Long codeU);
	public List<Motivation>getMotivations();
	public List<SecteurActivite> getSecteurActivites();
	public List<SecteurGeographique> getSecteurGeos();
	public List<Commentaire> getCommentaireProjet(Long codeP);
	public List<Contribution> getContributionProjet(Long codeP);
	public Boolean isYour(Projet P, Utilisateur U);

	
}
