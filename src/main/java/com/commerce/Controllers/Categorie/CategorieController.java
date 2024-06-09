package com.commerce.Controllers.Categorie;

import com.commerce.Models.Categorie;
import com.commerce.Models.Produit;
import com.commerce.Services.Categorie.CategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/categorie")
@RestController
public class CategorieController {

    private final CategorieService categorieService;

    public CategorieController(CategorieService categorieService) {
        this.categorieService = categorieService;
    }

    @PostMapping("")
    Categorie add(@RequestBody Categorie categorie){
        return this.categorieService.create(categorie);
    }

    @PutMapping("")
    Categorie modify(@RequestBody Categorie categorie){
        return  this.categorieService.update(categorie);
    }

    @DeleteMapping("/{id}")
    void drop(@PathVariable Long id){
       this.categorieService.delete(id);
    }

    @GetMapping("")
    List<Categorie> getAllCategorie(){
        return this.categorieService.getAll();
    }

    @GetMapping("/{id}")
    Categorie getCategorieById(@PathVariable Long id){
        return this.categorieService.getById(id);
    }


}
