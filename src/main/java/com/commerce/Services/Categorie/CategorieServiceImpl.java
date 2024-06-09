package com.commerce.Services.Categorie;

import com.commerce.Models.Categorie;
import com.commerce.Repository.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorieServiceImpl implements CategorieService{

    private final CategorieRepository categorieRepository;

    public CategorieServiceImpl(CategorieRepository categorieRepository) {
        this.categorieRepository = categorieRepository;
    }

    @Override
    public Categorie create(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public Categorie update(Categorie categorie) {
        return this.categorieRepository.save(categorie);
    }

    @Override
    public void delete(Long id) {
        this.categorieRepository.deleteById(id);
    }

    @Override
    public List<Categorie> getAll() {
        return this.categorieRepository.findAll();
    }

    @Override
    public Categorie getById(Long id) {
        return this.categorieRepository.findById(id).get();
    }
}
