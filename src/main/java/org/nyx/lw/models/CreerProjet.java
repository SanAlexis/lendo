package org.nyx.lw.models;

import org.nyx.lw.entities.Categorie;

public class CreerProjet {
private String titre;
private Categorie categorie;
private Double montant;
public Categorie getCategorie() {
	return categorie;
}
public void setCategorie(Categorie categorie) {
	this.categorie = categorie;
}
public String getTitre() {
	return titre;
}
public void setTitre(String titre) {
	this.titre = titre;
}
public Double getMontant() {
	return montant;
}
public void setMontant(Double montant) {
	this.montant = montant;
}

}
