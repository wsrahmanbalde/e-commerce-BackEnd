package com.commerce.Services.Produit;

import com.commerce.Models.Produit;
import com.commerce.Repository.ProduitRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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

    @Override
    public Produit update(Produit produit) {
        return produitRepository.save(produit);
    }

    @Override
    public void delete(Long id) {
        this.produitRepository.deleteById(id);
    }

    @Override
    public List<Produit> getAllProduit() {
        return this.produitRepository.findAll();
    }

    @Override
    public Produit getProduitById(Long id) {
        return this.produitRepository.findById(id).get();
    }
}
