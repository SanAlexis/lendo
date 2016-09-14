package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Utilisateur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeUtilisateur;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	private String lieuNaissance;
	private String adresse;
	private String codePostal;
	private String telephone;
	private String adresse2;
	private String email;
	private String password;
	private String experience;
	private String sourceRevenu;
	private Date dateCreation;
	private Motivation motivation;
	@ManyToOne
	@JoinColumn(name="codeSecteurActivite")
	private SecteurActivite secteurActivite;
	@ManyToOne
	@JoinColumn(name="codeActivitePro")
	private ActiviteProfessionel activitePro;
	@ManyToOne
	@JoinColumn(name="codeSecteurGeo")
	private SecteurGeographique secteurGeo;
	@OneToMany(mappedBy="utilisateur",fetch=FetchType.LAZY)
	private List<Commentaire> commentaires;
	@OneToMany(mappedBy="promoteur",fetch=FetchType.LAZY)
	private List<Projet> projets;
	@OneToMany(mappedBy="utilisateur",fetch=FetchType.LAZY)
	private List<Contribution> contributions;
	@OneToMany(mappedBy="utilisateur",fetch=FetchType.LAZY)
	private List<LendoUtilisateur> lendoutilisateur;
	@OneToMany(mappedBy="utilisateur",fetch=FetchType.LAZY)
	private List<Operation> operations;
	
	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nom, String prenom, Date dateNaissance,
			String lieuNaissance, String adresse, String codePostal,
			String telephone, String adresse2, String email, String experience,
			String sourceRevenu) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.lieuNaissance = lieuNaissance;
		this.adresse = adresse;
		this.codePostal = codePostal;
		this.telephone = telephone;
		this.adresse2 = adresse2;
		this.email = email;
		this.experience = experience;
		this.sourceRevenu = sourceRevenu;
		
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getCodeUtilisateur() {
		return codeUtilisateur;
	}

	public void setCodeUtilisateur(Long codeUtilisateur) {
		this.codeUtilisateur = codeUtilisateur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getAdresse2() {
		return adresse2;
	}

	public void setAdresse2(String adresse2) {
		this.adresse2 = adresse2;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getExperience() {
		return experience;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public String getSourceRevenu() {
		return sourceRevenu;
	}

	public void setSourceRevenu(String sourceRevenu) {
		this.sourceRevenu = sourceRevenu;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Motivation getMotivation() {
		return motivation;
	}

	public void setMotivation(Motivation motivation) {
		this.motivation = motivation;
	}

	public SecteurActivite getSecteurActivite() {
		return secteurActivite;
	}

	public void setSecteurActivite(SecteurActivite secteurActivite) {
		this.secteurActivite = secteurActivite;
	}

	public ActiviteProfessionel getActivitePro() {
		return activitePro;
	}

	public void setActivitePro(ActiviteProfessionel activitePro) {
		this.activitePro = activitePro;
	}

	public SecteurGeographique getSecteurGeo() {
		return secteurGeo;
	}

	public void setSecteurGeo(SecteurGeographique secteurGeo) {
		this.secteurGeo = secteurGeo;
	}

	public List<Commentaire> getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(List<Commentaire> commentaires) {
		this.commentaires = commentaires;
	}

	public List<Projet> getProjets() {
		return projets;
	}

	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}

	public List<Contribution> getContributions() {
		return contributions;
	}

	public void setContributions(List<Contribution> contributions) {
		this.contributions = contributions;
	}

	
	public List<Operation> getOperations() {
		return operations;
	}

	public void setOperations(List<Operation> operations) {
		this.operations = operations;
	}

	public List<LendoUtilisateur> getLendoutilisateur() {
		return lendoutilisateur;
	}

	public void setLendoutilisateur(List<LendoUtilisateur> lendoutilisateur) {
		this.lendoutilisateur = lendoutilisateur;
	}

	
	

}
