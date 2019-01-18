package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name = "Film")
public class Film extends Media {


    @Column(name = "duree")
    private int duree;

    public Film(int id, String titre, String genre, Date date, String image, int note, int classification, int duree) {
        super(id, titre, genre, date, image, note, classification);
        this.duree = duree;
    }
    public Film() {
        super();

    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }
}
