package com.commerce.Models;

import jakarta.persistence.Entity;
import lombok.*;

import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@Entity
public class Produit {
    private int id;
    private String nom;
    private Double prix;
    private Date dateCreation;
}
