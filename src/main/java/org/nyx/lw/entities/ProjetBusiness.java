package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("PB")
public class ProjetBusiness extends Projet{
	private double tauxFixe;

	public ProjetBusiness() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProjetBusiness(String titre, String description,
			double montantAttendu, String slogan, String pays, String ville,
			int dureeCampagne, String busnessPlan, String presentation, Date dateDebutCampagne) {
		super(titre, description, montantAttendu, slogan, pays, ville, dureeCampagne,
				busnessPlan, presentation,dateDebutCampagne);
		// TODO Auto-generated constructor stub
	}

	public double getTauxFixe() {
		return tauxFixe;
	}

	public void setTauxFixe(double tauxFixe) {
		this.tauxFixe = tauxFixe;
	}
	
	

}
