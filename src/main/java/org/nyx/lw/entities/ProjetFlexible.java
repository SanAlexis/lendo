package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("PF")
public class ProjetFlexible extends Projet{
	private double taux;

	public ProjetFlexible() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjetFlexible(String titre, String description,
			double montantAttendu, String slogan, String pays, String ville,
			int dureeCampagne, String busnessPlan, String presentation,
			 Date dateDebutCampagne) {
		super(titre, description, montantAttendu, slogan, pays, ville, dureeCampagne,
				busnessPlan, presentation, dateDebutCampagne);
		// TODO Auto-generated constructor stub
	}

	public double getTaux() {
		return taux;
	}

	public void setTaux(double taux) {
		this.taux = taux;
	}
	
	

}
