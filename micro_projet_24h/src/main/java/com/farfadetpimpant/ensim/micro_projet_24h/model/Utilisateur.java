package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@Column(name = "pseudo", unique = true)
	private String pseudo;

	@Column(name = "mot_de_passe")
	private String motDePasse;

	@Column(name = "nom", nullable = false)
	private String nom;

	@Column(name = "prenom", nullable = false)
	private String prenom;

	public Utilisateur() {

    }

	public Utilisateur(String pseudo, String mdp, String nm, String pnm) {
	    this.pseudo = pseudo;
		this.motDePasse = mdp;
		this.nom = nm;
		this.prenom = pnm;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getNom() {
		return nom;
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
}
