package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class TypeMedia implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeType;
	private String libelle;
	private String description;
	public TypeMedia() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TypeMedia(String libelle, String description) {
		super();
		this.libelle = libelle;
		this.description = description;
	}
	public Long getCodeType() {
		return codeType;
	}
	public void setCodeType(Long codeType) {
		this.codeType = codeType;
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
