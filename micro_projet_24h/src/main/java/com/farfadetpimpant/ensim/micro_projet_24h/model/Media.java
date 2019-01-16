package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "utilisateur")
public abstract class  Media {

    @Id
    @Column(name = "id_media")
    private int id;


    @Column(name = "titre")
    private String titre;


    @Column(name = "genre")
    private String genre;

    @Column(name = "date")
    private Date date;


    @Column(name = "note")
    private int note;

    @Column(name = "classification")
    private int classification;


    public Media(int id, String titre, String genre, Date date, int note, int classification) {
        this.id = id;
        this.titre = titre;
        this.genre = genre;
        this.date = date;
        this.note = note;
        this.classification = classification;
    }
    public Media(){

    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int getClassification() {
        return classification;
    }

    public void setClassification(int classification) {
        this.classification = classification;
    }
}
