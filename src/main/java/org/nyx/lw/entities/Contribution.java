package org.nyx.lw.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_CONTRIB", discriminatorType=DiscriminatorType.STRING, length=2)
public class Contribution implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeContribution;
	private double montant;
	private String provenanceFonds;
	private Date dateVersement;
	@ManyToOne
	@JoinColumn(name="codeUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="codeProjet")
	private Projet projet;
	
	public Contribution() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Contribution(double montant, String provenanceFonds) {
		super();
		this.montant = montant;
		this.provenanceFonds = provenanceFonds;
	}

	public Long getCodeContribution() {
		return codeContribution;
	}

	public void setCodeContribution(Long codeContribution) {
		this.codeContribution = codeContribution;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public String getProvenanceFonds() {
		return provenanceFonds;
	}

	public void setProvenanceFonds(String provenanceFonds) {
		this.provenanceFonds = provenanceFonds;
	}

	public Date getDateVersement() {
		return dateVersement;
	}

	public void setDateVersement(Date dateVersement) {
		this.dateVersement = dateVersement;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	
	

}
