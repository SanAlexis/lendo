package org.nyx.lw.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Media implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeMedia;
	private String chemin;
	private String description;
	private String url;
	@ManyToOne
	@JoinColumn(name="codeProjet")
	private Projet projet;
	@ManyToOne
	@JoinColumn(name="codeTypemedia")
	private TypeMedia typeMedia;
	public Media() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Media(String chemin, String description, String url) {
		super();
		this.chemin = chemin;
		this.description = description;
		this.url = url;
	}
	public Long getCodeMedia() {
		return codeMedia;
	}
	public void setCodeMedia(Long codeMedia) {
		this.codeMedia = codeMedia;
	}
	public String getChemin() {
		return chemin;
	}
	public void setChemin(String chemin) {
		this.chemin = chemin;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public TypeMedia getTypeMedia() {
		return typeMedia;
	}
	public void setTypeMedia(TypeMedia typeMedia) {
		this.typeMedia = typeMedia;
	}
	
	

}
