package com.gestion.bibliotheque.controllers;

import com.gestion.bibliotheque.dtos.LivreDto;
import com.gestion.bibliotheque.services.ILivreService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Livre")
public class LivreController {

    private final ILivreService iLivreService;


    public LivreController(ILivreService iLivreService) {
        this.iLivreService = iLivreService;
    }


    @PostMapping
    public LivreDto addLivre(@RequestBody LivreDto livreDto){
        return iLivreService.addLivre(livreDto);
    }

    @PutMapping("/{id}")
    public LivreDto updateLivre(@PathVariable Long id, @RequestBody LivreDto livreDto){
        return iLivreService.updateLivre(id,livreDto);
    }

    @DeleteMapping("/{id}")
    void deleteLivre(@PathVariable Long id){
        iLivreService.deleteLivre(id);
    }

    @GetMapping
    public List<LivreDto> getLivres(){
        return iLivreService.getAll();
    }

    @GetMapping("/{id}")
    public LivreDto getLivre(@PathVariable Long id){
        return iLivreService.getLivre(id);
    }
}
