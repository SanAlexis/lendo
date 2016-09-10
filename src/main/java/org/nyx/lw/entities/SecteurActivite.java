package org.nyx.lw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class SecteurActivite implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeSecteur;
	private String libelle;
	private String description;
	public SecteurActivite() {
		super();
		// TODO Auto-generated constructor stub
	}
	public SecteurActivite(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Long getCodeSecteur() {
		return codeSecteur;
	}
	public void setCodeSecteur(Long codeSecteur) {
		this.codeSecteur = codeSecteur;
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
	
	

}
