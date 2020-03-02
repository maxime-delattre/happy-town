package com.happytown.domain;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Data
@Builder
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "habitant")
@JsonPropertyOrder({ "id", "nom", "prenom", "email", "dateNaissance", "dateArriveeCommune", "adressePostale", "cadeauOffert", "dateAttributionCadeau" })
public class Habitant {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
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

}
