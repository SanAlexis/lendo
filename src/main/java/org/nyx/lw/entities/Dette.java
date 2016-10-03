package org.nyx.lw.entities;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import java.util.Date;
@Entity
@DiscriminatorValue("DE")
public class Dette extends Contribution {
	private double contrepartie;
	private Date dateRemboursement;
	
	public Dette(double montant, String provenanceFonds, double contrepartie,Date dateRemboursement) {
		super(montant, provenanceFonds);
		this.contrepartie = contrepartie;
		this.dateRemboursement = dateRemboursement;
	}
	public Dette() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dette(double montant, String provenanceFonds) {
		super(montant, provenanceFonds);
		// TODO Auto-generated constructor stub
	}
	public double getContrepartie() {
		return contrepartie;
	}
	public void setContrepartie(double contrepartie) {
		this.contrepartie = contrepartie;
	}
	public Date getDateRemboursement() {
		return dateRemboursement;
	}
	public void setDateRemboursement(Date dateRemboursement) {
		this.dateRemboursement = dateRemboursement;
	}
	
	
}
