package com.example.wwsflotte.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Typevehicule {

    @Id
    @SequenceGenerator(
        name = "typevehicule_sequence",
        sequenceName = "typevehicule_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "typevehicule_sequence"
    )
    Long idtype;
    String nomtype;
    public Long getIdtype() {
        return idtype;
    }
    public void setIdtype(Long idtype) {
        this.idtype = idtype;
    }
    public String getNomtype() {
        return nomtype;
    }
    public void setNomtype(String nomtype) {
        this.nomtype = nomtype;
    }
    public Typevehicule(Long idtype, String nomtype) {
        this.idtype = idtype;
        this.nomtype = nomtype;
    }
    public Typevehicule() {
    }
    
}
