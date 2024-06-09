package com.commerce.Services.Produit;

import com.commerce.Models.Produit;
import com.commerce.Repository.ProduitRepository;
import org.springframework.stereotype.Service;

@Service
public class ProduitServiceImpl  implements ProduitService{

    private final ProduitRepository produitRepository;

    public ProduitServiceImpl(ProduitRepository produitRepository) {
        this.produitRepository = produitRepository;
    }

    @Override
    public Produit addProduit(Produit produit) {
        return produitRepository.save(produit);
    }
}
