package com.gestion.bibliotheque.controllers;

import com.gestion.bibliotheque.dtos.CategorieDto;
import com.gestion.bibliotheque.services.ICategorieService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Categorie")
public class CategorieController {


    private final ICategorieService iCategorieService;


    public CategorieController(ICategorieService iCategorieService) {
        this.iCategorieService = iCategorieService;
    }


    @PostMapping
    public CategorieDto addCategorie(@RequestBody CategorieDto categorieDto){
        return iCategorieService.addCategorie(categorieDto);
    }

    @PutMapping("/{id}")
    public CategorieDto updateCategorie(@PathVariable Long id,@RequestBody CategorieDto categorieDto){
        return iCategorieService.updateCategorie(id,categorieDto);
    }

    @DeleteMapping("/{id}")
    void deleteCategorie(@PathVariable Long id){
        iCategorieService.deleteCategorie(id);
    }

    @GetMapping
    public List<CategorieDto> getCategories(){
        return iCategorieService.getAll();
    }

    @GetMapping("/{id}")
    public CategorieDto getAuteur(@PathVariable Long id){
        return iCategorieService.getCategorie(id);
    }


}
