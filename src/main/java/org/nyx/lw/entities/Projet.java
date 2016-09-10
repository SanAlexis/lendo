package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_PROJET", discriminatorType=DiscriminatorType.STRING, length=4)
public class Projet implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeProjet;
	private String titre;
	private String description;
	private double montantAttendu;
	private String slogan;
	private String pays;
	private String ville;
	private int dureeCampagne;
	private String busnessPlan;
	private String presentation;
	private Date dateCreation;
	private Date dateDebutCampagne;
	@ManyToOne
	@JoinColumn(name="codePromoteur")
	private Utilisateur promoteur;
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY)
	private List<Commentaire> commentaires;
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY)
	private List<LendoProjet> lendoprojet;
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY)
	private List<Contribution> contributions;
	@OneToMany(mappedBy="projet",fetch=FetchType.LAZY)
	private List<Media> medias;
	@ManyToOne
	@JoinColumn(name="codeCategorie")
	private Categorie categorie;
	
	public Projet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Projet(String titre, String description, double montantAttendu,
			String slogan, String pays, String ville, int dureeCampagne,
			String busnessPlan, String presentation,
			Date dateDebutCampagne) {
		super();
		this.titre = titre;
		this.description = description;
		this.montantAttendu = montantAttendu;
		this.slogan = slogan;
		this.pays = pays;
		this.ville = ville;
		this.dureeCampagne = dureeCampagne;
		this.busnessPlan = busnessPlan;
		this.presentation = presentation;
		
		this.dateDebutCampagne = dateDebutCampagne;
		
	}

	public Long getCodeProjet() {
		return codeProjet;
	}

	public void setCodeProjet(Long codeProjet) {
		this.codeProjet = codeProjet;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getMontantAttendu() {
		return montantAttendu;
	}

	public void setMontantAttendu(double montantAttendu) {
		this.montantAttendu = montantAttendu;
	}

	public String getSlogan() {
		return slogan;
	}

	public void setSlogan(String slogan) {
		this.slogan = slogan;
	}

	public String getPays() {
		return pays;
	}

	public void setPays(String pays) {
		this.pays = pays;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getDureeCampagne() {
		return dureeCampagne;
	}

	public void setDureeCampagne(int dureeCampagne) {
		this.dureeCampagne = dureeCampagne;
	}

	public String getBusnessPlan() {
		return busnessPlan;
	}

	public void setBusnessPlan(String busnessPlan) {
		this.busnessPlan = busnessPlan;
	}

	public String getPresentation() {
		return presentation;
	}

	public void setPresentation(String presentation) {
		this.presentation = presentation;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateDebutCampagne() {
		return dateDebutCampagne;
	}

	public void setDateDebutCampagne(Date dateDebutCampagne) {
		this.dateDebutCampagne = dateDebutCampagne;
	}

	public Utilisateur getPromoteur() {
		return promoteur;
	}

	public void setPromoteur(Utilisateur promoteur) {
		this.promoteur = promoteur;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	



	public List<LendoProjet> getLendoprojet() {
		return lendoprojet;
	}

	public void setLendoprojet(List<LendoProjet> lendoprojet) {
		this.lendoprojet = lendoprojet;
	}

	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	public List<Media> getMedias() {
		return medias;
	}

	public void setMedias(List<Media> medias) {
		this.medias = medias;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	

}
