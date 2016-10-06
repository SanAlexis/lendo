package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Commentaire implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeCommentaire;
	private String titre;
	private String description;
	private Date datePost;
	@ManyToOne
	@JoinColumn(name="codeProjet")
	private Projet projet;
	@ManyToOne
	@JoinColumn(name="codeUtilisateur")
	private Utilisateur utilisateur;
	
	public Commentaire() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Commentaire(String titre, String description,Date datePost) {
		super();
		this.titre = titre;
		this.description = description;
		this.datePost=datePost;
	}

	public Long getCodeCommentaire() {
		return codeCommentaire;
	}

	public void setCodeCommentaire(Long codeCommentaire) {
		this.codeCommentaire = codeCommentaire;
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

	public Date getDatePost() {
		return datePost;
	}

	public void setDatePost(Date datePost) {
		this.datePost = datePost;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
