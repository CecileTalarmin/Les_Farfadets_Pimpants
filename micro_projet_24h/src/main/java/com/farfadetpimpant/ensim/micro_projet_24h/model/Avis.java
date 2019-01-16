package com.farfadetpimpant.ensim.micro_projet_24h.model;

import javax.persistence.*;

@Entity
@Table(name = "Avis")
public class Avis {

    @Id
    @Column(name = "id_note")
    private int id;

    @Column(name = "note")
    private int note;

    @Column(name = "commentaire")
    private String commentaire;

    public Avis() {

    }

    public Avis(int i, int n, String c) {
        this.id = i;
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
