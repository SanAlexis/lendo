package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("V")
public class Versement extends Operation{

	public Versement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Versement(double montant, Date dateOperation, Utilisateur utilisateur,LendoWallet lendowallet){
		super(montant, dateOperation);
	}
	
	
	

}
