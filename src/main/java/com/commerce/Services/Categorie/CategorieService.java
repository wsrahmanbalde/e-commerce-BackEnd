package com.commerce.Services.Categorie;

import com.commerce.Controllers.Categorie.Categorie;

import java.util.List;

public interface CategorieService {

    Categorie create(Categorie categorie);

    Categorie update(Categorie categorie);

    void delete(Long id);

    List<Categorie> getAll();

    Categorie getById(Long id);
}
