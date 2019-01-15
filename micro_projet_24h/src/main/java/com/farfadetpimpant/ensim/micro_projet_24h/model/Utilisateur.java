package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.*;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	@Id
	@Column(name = "id_utilisateur")
	private Integer id;

	@Column(name = "mot_de_passe")
	private String motDePasse;

	@Column(name = "nom")
	private String nom;

	@Column(name = "prenom")
	private String prenom;

	public Utilisateur() {

    }

	public Utilisateur(Integer id, String mdp, String nm, String pnm) {
	    this.id = id;
		this.motDePasse = mdp;
		this.nom = nm;
		this.prenom = pnm;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
