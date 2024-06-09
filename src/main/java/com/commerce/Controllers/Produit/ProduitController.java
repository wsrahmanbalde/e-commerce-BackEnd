package com.commerce.Controllers.Produit;

import com.commerce.Models.Produit;
import com.commerce.Services.Produit.ProduitService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/produits")
@RestController
public class ProduitController {

    private final ProduitService produitService;


    public ProduitController(ProduitService produitService) {
        this.produitService = produitService;
    }

    @PostMapping("")
    Produit createProduit(@RequestBody Produit produit){
        return this.produitService.addProduit(produit);
    }
}
