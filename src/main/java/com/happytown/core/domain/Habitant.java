package com.happytown.core.domain;

import java.time.LocalDate;

public class Habitant {

    private String id;
    private String nom;
    private String prenom;
    private String email;
    private LocalDate dateNaissance;
    private LocalDate dateArriveeCommune;
    private String adressePostale;
    private String cadeauOffert;
    private LocalDate dateAttributionCadeau;

    public Habitant() {
    }

    public Habitant(String id, String nom, String prenom, String email, LocalDate dateNaissance, LocalDate dateArriveeCommune, String adressePostale) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.dateNaissance = dateNaissance;
        this.dateArriveeCommune = dateArriveeCommune;
        this.adressePostale = adressePostale;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getEmail() {
        return email;
    }

    public LocalDate getDateNaissance() {
        return dateNaissance;
    }

    public String getCadeauOffert() {
        return cadeauOffert;
    }

    public void setCadeauOffert(String cadeauOffert) {
        this.cadeauOffert = cadeauOffert;
    }

    public LocalDate getDateAttributionCadeau() {
        return dateAttributionCadeau;
    }

    public String getId() {
        return id;
    }

    public LocalDate getDateArriveeCommune() {
        return dateArriveeCommune;
    }

    public String getAdressePostale() {
        return adressePostale;
    }

    public void setDateAttributionCadeau(LocalDate dateAttributionCadeau) {
        this.dateAttributionCadeau = dateAttributionCadeau;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDateNaissance(LocalDate dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setDateArriveeCommune(LocalDate dateArriveeCommune) {
        this.dateArriveeCommune = dateArriveeCommune;
    }

    public void setAdressePostale(String adressePostale) {
        this.adressePostale = adressePostale;
    }

    public void attribuerCadeau(String cadeauOffert, LocalDate dateAttributionCadeau) {
        this.cadeauOffert = cadeauOffert;
        this.dateAttributionCadeau = dateAttributionCadeau;
    }
}
