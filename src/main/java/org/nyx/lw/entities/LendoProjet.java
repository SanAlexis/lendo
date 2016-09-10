package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
@DiscriminatorValue("LWP")
public class LendoProjet extends LendoWallet{
	@OneToOne
	private Projet projet;

	public LendoProjet() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LendoProjet(double solde) {
		super(solde);

	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
	

}
