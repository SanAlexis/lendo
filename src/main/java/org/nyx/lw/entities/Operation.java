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
@DiscriminatorColumn(name="TYPE_OP", discriminatorType=DiscriminatorType.STRING, length=4)
public class Operation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long codeOperation;
	private double montant;
	private Date dateOperation;
	@ManyToOne
	@JoinColumn(name="codeUtilisateur")
	private Utilisateur utilisateur;
	@ManyToOne
	@JoinColumn(name="numeroCompte")
	private LendoWallet lendowallet;
	
	public Operation() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Operation(double montant, Date dateOperation) {
		super();
		this.montant = montant;
		this.dateOperation = dateOperation;
	}

	public Long getCodeOperation() {
		return codeOperation;
	}

	public void setCodeOperation(Long codeOperation) {
		this.codeOperation = codeOperation;
	}

	public double getMontant() {
		return montant;
	}

	public void setMontant(double montant) {
		this.montant = montant;
	}

	public Date getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(Date dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public LendoWallet getLendowallet() {
		return lendowallet;
	}

	public void setLendowallet(LendoWallet lendowallet) {
		this.lendowallet = lendowallet;
	}
	
	
	

}
