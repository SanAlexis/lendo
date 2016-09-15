package org.nyx.lw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Motivation implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeMotviation;
	private String libelle;
	private String description;
	public Motivation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Motivation(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Long getCodeMotviation() {
		return codeMotviation;
	}
	public void setCodeMotviation(Long codeMotviation) {
		this.codeMotviation = codeMotviation;
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
