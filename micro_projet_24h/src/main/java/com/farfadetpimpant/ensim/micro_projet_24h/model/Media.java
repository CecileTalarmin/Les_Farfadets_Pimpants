package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "media")
public abstract class  Media {

    @Id
    @Column(name = "id_media", unique = true)
    private int id;

    @Column(name = "titre")
    private String titre;

    @Column(name = "genre")
    private String genre;

    @Column(name = "date")
    private Date date;

    @Column (name = "image")
    private String image;

    @Column(name = "note")
    private int note;

    @Column(name = "classification")
    private int classification;


    public Media(int id, String titre, String genre, Date date, String image, int note, int classification) {
        this.id = id;
        this.titre = titre;
        this.genre = genre;
        this.date = date;
        this.image = image;
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

    public String getImage() { return image; }

    public void setImage(String imgage) {
        this.image = image;
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
