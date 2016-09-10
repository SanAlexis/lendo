package org.nyx.lw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class ActiviteProfessionel implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeActivite;
	private String libelle;
	private String description;
	@ManyToOne
	@JoinColumn(name="codeUtilisateur")
	private Utilisateur utilisateur;
	public ActiviteProfessionel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ActiviteProfessionel(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Long getCodeActivite() {
		return codeActivite;
	}
	public void setCodeActivite(Long codeActivite) {
		this.codeActivite = codeActivite;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
	

}
