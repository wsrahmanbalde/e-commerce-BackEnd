package com.commerce.Services.Categorie;

import com.commerce.Models.Categorie;
import com.commerce.Repository.CategorieRepository;

import java.util.List;

public interface CategorieService {

    Categorie create(Categorie categorie);

    Categorie update(Categorie categorie);

    void delete(Long id);

    List<Categorie> getAll();

    Categorie getById(Long id);
}
