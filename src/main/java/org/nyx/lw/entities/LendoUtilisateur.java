package org.nyx.lw.entities;

import java.util.Date;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
@Entity
@DiscriminatorValue("LWU")
public class LendoUtilisateur extends LendoWallet{
	@OneToOne
	private Utilisateur utilisateur;

	public LendoUtilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LendoUtilisateur(double solde) {
		super(solde);
	}


	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

}
