package com.commerce.Repository;

import com.commerce.Models.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProduitRepository extends JpaRepository<Produit,Long> {

    List<Produit> findByNom(String nom);
    List<Produit> findByNomContains(String nom);
}
