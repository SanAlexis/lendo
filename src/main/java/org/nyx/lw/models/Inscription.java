package org.nyx.lw.models;

import org.nyx.lw.entities.Utilisateur;

public class Inscription {
private Utilisateur user;
	private String nom;
	private String prenom;
	private String email;
	private String password;
	public String getNom() {
		return nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Utilisateur getUser() {
		return user;
	}
	public void setUser(Utilisateur user) {
		this.user = user;
	}

}
