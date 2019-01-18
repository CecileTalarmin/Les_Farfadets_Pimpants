package com.farfadetpimpant.ensim.micro_projet_24h.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Serie")
public class Serie extends Media{

    @Column(name = "nbSaison")
    private int nbSaison;

    public Serie(String titre, String genre, Date date, String image, int note, int classification, int nbSaison) {
        super(titre, genre, date, image, note, classification);
        this.nbSaison = nbSaison;
    }

    public Serie() {

    }

    public int getNbSaison() {
        return nbSaison;
    }

    public void setNbSaison(int nbSaison) {
        this.nbSaison = nbSaison;
    }
}
