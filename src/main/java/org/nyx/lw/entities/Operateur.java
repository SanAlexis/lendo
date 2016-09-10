package org.nyx.lw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Operateur implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeOperateur;
	private String libelle;
	
	public Operateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Operateur( String libelle) {
		super();
		this.libelle = libelle;
	}

	public Long getCodeOperateur() {
		return codeOperateur;
	}

	public void setCodeOperateur(Long codeOperateur) {
		this.codeOperateur = codeOperateur;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	

}
