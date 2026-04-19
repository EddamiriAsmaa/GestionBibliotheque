package com.gestion.bibliotheque.controllers;

import com.gestion.bibliotheque.dtos.AuteurDto;
import com.gestion.bibliotheque.services.IAuteurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Auteur")
public class AuteurController {

    private final IAuteurService iAuteurService;


    public AuteurController(IAuteurService iAuteurService) {
        this.iAuteurService = iAuteurService;
    }


    @PostMapping
    public AuteurDto addAuteur(@RequestBody AuteurDto auteurDto){
        return iAuteurService.addAuteur(auteurDto);
    }

    @PutMapping("/{id}")
    public AuteurDto updateAuteur(@PathVariable Long id,@RequestBody AuteurDto auteurDto){
        return iAuteurService.updateAuteur(id,auteurDto);
    }

    @DeleteMapping("/{id}")
    void deleteAuteur(@PathVariable Long id){
        iAuteurService.deleteAuteur(id);
    }

    @GetMapping
    public List<AuteurDto> getAuteurs(){
        return iAuteurService.getAll();
    }

    @GetMapping("/{id}")
    public AuteurDto getAuteur(@PathVariable Long id){
        return iAuteurService.getAuteur(id);
    }
}
