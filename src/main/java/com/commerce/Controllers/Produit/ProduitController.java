package com.commerce.Controllers.Produit;

import com.commerce.Models.Produit;
import com.commerce.Services.Produit.ProduitService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @PutMapping("")
    Produit updateProduit(@RequestBody Produit produit){
        return this.produitService.update(produit);
    }
    @GetMapping("")
    List<Produit> getAll(){
        return this.produitService.getAllProduit();
    }

    @GetMapping("/{id}")
    Produit getById(@PathVariable Long id){
        return this.produitService.getProduitById(id);
    }

    @DeleteMapping("/{id}")
    void deleteById(@PathVariable Long id){
        this.produitService.delete(id);
    }
}
