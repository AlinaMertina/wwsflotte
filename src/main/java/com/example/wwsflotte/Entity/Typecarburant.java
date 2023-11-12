package com.example.wwsflotte.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Typecarburant {
    @Id
    @SequenceGenerator(
        name = "typecarburant_sequence",
        sequenceName = "typecarburant_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "typecarburant_sequence"
    )
    Long idcarburant;
    String nomcarburant;
    public Long getIdcarburant() {
        return idcarburant;
    }
    public void setIdcarburant(Long idcarburant) {
        this.idcarburant = idcarburant;
    }
    public String getNomcarburant() {
        return nomcarburant;
    }
    public void setNomcarburant(String nomcarburant) {
        this.nomcarburant = nomcarburant;
    }
    public Typecarburant(Long idcarburant, String nomcarburant) {
        this.idcarburant = idcarburant;
        this.nomcarburant = nomcarburant;
    }
    public Typecarburant() {
    }
    
}
