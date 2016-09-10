package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Categorie implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeCategorie;
	private String libelle;
	@OneToMany(mappedBy="categorie",fetch=FetchType.LAZY)
	private List<Projet> projets;
	public Categorie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Categorie(String libelle) {
		super();
		this.libelle = libelle;
	}
	public Long getCodeCategorie() {
		return codeCategorie;
	}
	public void setCodeCategorie(Long codeCategorie) {
		this.codeCategorie = codeCategorie;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public List<Projet> getProjets() {
		return projets;
	}
	public void setProjets(List<Projet> projets) {
		this.projets = projets;
	}
	
	

}
