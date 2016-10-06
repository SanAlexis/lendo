package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
@Entity
@DiscriminatorValue("R")
public class Retrait extends Operation{

	public Retrait() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Retrait(double montant, Date dateOperation, Utilisateur utilisateur,LendoWallet lendowallet) {
		super(montant, dateOperation);
		// TODO Auto-generated constructor stub
	}
	

}
