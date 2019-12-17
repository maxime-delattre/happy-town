package com.happytown.core.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name = "habitant")
@JsonPropertyOrder({ "id", "nom", "prenom", "email", "dateNaissance", "dateArriveeCommune", "adressePostale", "cadeauOffert", "dateAttributionCadeau" })
public class Habitant {

    @Id
    @ApiModelProperty(position = 0)
    private String id;
    @ApiModelProperty(position = 1)
    private String nom;
    @ApiModelProperty(position = 2)
    private String prenom;
    @ApiModelProperty(position = 3)
    private String email;
    @ApiModelProperty(position = 4)
    private LocalDate dateNaissance;
    @ApiModelProperty(position = 5)
    private LocalDate dateArriveeCommune;
    @ApiModelProperty(position = 6)
    private String adressePostale;
    @ApiModelProperty(position = 7)
    private String cadeauOffert;
    @ApiModelProperty(position = 8)
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

    public void setDateAttributionCadeau(LocalDate dateAttributionCadeau) {
        this.dateAttributionCadeau = dateAttributionCadeau;
    }
}