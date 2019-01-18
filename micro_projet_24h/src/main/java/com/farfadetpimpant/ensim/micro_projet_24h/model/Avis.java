package com.farfadetpimpant.ensim.micro_projet_24h.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
@Table(name = "Avis")
public class Avis {

    @Id
    @GeneratedValue(
            strategy = GenerationType.AUTO,
            generator = "native"
    )
    @GenericGenerator(
            name = "native",
            strategy = "native"
    )
    private int id;

    @Column(name = "note")
    private int note;

    @Column(name = "commentaire")
    private String commentaire;

    public Avis() {

    }

    public Avis(int n, String c) {
        this.note = n;
        this.commentaire = c;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public String getCommentaire() {
        return commentaire;
    }

    public void setCommentaire(String commentaire) {
        this.commentaire = commentaire;
    }
}
