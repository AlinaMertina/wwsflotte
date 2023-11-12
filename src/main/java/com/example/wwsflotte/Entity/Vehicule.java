package com.example.wwsflotte.Entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Vehicule {
    @Id
    @SequenceGenerator(
        name = "vehicule_sequence",
        sequenceName = "vehicule_sequence",
        allocationSize = 1
    )
    @GeneratedValue(
        strategy = GenerationType.SEQUENCE,
        generator = "vehicule_sequence"
    )
    Long idvehicule;
    String matricule;
    String numerodechassi;
    java.util.Date  annedefabrication;
    Double cylindre;
    Double poidvide;
    Double poidcharger;
    Double puissance;
    Double carburantplaine;
    String marque;
    String modele;
    Long idftype;
    Long idfcarburant;

    public Long getIdvehicule() {
        return idvehicule;
    }
    public void setIdvehicule(Long idvehicule) {
        this.idvehicule = idvehicule;
    }
    public String getMatricule() {
        return matricule;
    }
    public void setMatricule(String matricule) {
        this.matricule = matricule;
    }
    public String getNumerodechassi() {
        return numerodechassi;
    }
    public void setNumerodechassi(String numerodechassi) {
        this.numerodechassi = numerodechassi;
    }
    public java.util.Date getAnnedefabrication() {
        return annedefabrication;
    }
    public void setAnnedefabrication(java.util.Date annedefabrication) {
        this.annedefabrication = annedefabrication;
    }
    public Double getCylindre() {
        return cylindre;
    }
    public void setCylindre(Double cylindre) {
        this.cylindre = cylindre;
    }
    public Double getPoidvide() {
        return poidvide;
    }
    public void setPoidvide(Double poidvide) {
        this.poidvide = poidvide;
    }
    public Double getPoidcharger() {
        return poidcharger;
    }
    public void setPoidcharger(Double poidcharger) {
        this.poidcharger = poidcharger;
    }
    public Double getPuissance() {
        return puissance;
    }
    public void setPuissance(Double puissance) {
        this.puissance = puissance;
    }
    public Double getCarburantplaine() {
        return carburantplaine;
    }
    public void setCarburantplaine(Double carburantplaine) {
        this.carburantplaine = carburantplaine;
    }
    public String getMarque() {
        return marque;
    }
    public void setMarque(String marque) {
        this.marque = marque;
    }
    public String getModele() {
        return modele;
    }
    public void setModele(String modele) {
        this.modele = modele;
    }
    public Long getIdftype() {
        return idftype;
    }
    public void setIdftype(Long idftype) {
        this.idftype = idftype;
    }
    public Long getIdfcarburant() {
        return idfcarburant;
    }
    public void setIdfcarburant(Long idfcarburant) {
        this.idfcarburant = idfcarburant;
    }
    public Vehicule(Long idvehicule, String matricule, String numerodechassi, Date annedefabrication, Double cylindre,
            Double poidvide, Double poidcharger, Double puissance, Double carburantplaine, String marque, String modele,
            Long idftype, Long idfcarburant) {
        this.idvehicule = idvehicule;
        this.matricule = matricule;
        this.numerodechassi = numerodechassi;
        this.annedefabrication = annedefabrication;
        this.cylindre = cylindre;
        this.poidvide = poidvide;
        this.poidcharger = poidcharger;
        this.puissance = puissance;
        this.carburantplaine = carburantplaine;
        this.marque = marque;
        this.modele = modele;
        this.idftype = idftype;
        this.idfcarburant = idfcarburant;
    }
    public Vehicule(String matricule, String numerodechassi, Date annedefabrication, Double cylindre, Double poidvide,
            Double poidcharger, Double puissance, Double carburantplaine, String marque, String modele, Long idftype,
            Long idfcarburant) {
        this.matricule = matricule;
        this.numerodechassi = numerodechassi;
        this.annedefabrication = annedefabrication;
        this.cylindre = cylindre;
        this.poidvide = poidvide;
        this.poidcharger = poidcharger;
        this.puissance = puissance;
        this.carburantplaine = carburantplaine;
        this.marque = marque;
        this.modele = modele;
        this.idftype = idftype;
        this.idfcarburant = idfcarburant;
    }
    public Vehicule() {
    }

    

}
