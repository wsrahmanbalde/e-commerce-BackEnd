package com.commerce.Services.Produit;

import com.commerce.Models.Produit;

import java.util.List;

public interface ProduitService {

    Produit addProduit(Produit produit);

    Produit update(Produit produit);

    List<Produit> getAllProduit();

    Produit getProduitById(Long id);
}
