package com.gestion.bibliotheque.controllers;

import com.gestion.bibliotheque.dtos.EditeurDto;
import com.gestion.bibliotheque.services.IEditeurService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Editeur")
public class EditeurController {


    private final IEditeurService iEditeurService;


    public EditeurController(IEditeurService iEditeurService) {
        this.iEditeurService = iEditeurService;
    }


    @PostMapping
    public EditeurDto addEditeur(@RequestBody EditeurDto editeurDto){
        return iEditeurService.addEditeur(editeurDto);
    }

    @PutMapping("/{id}")
    public EditeurDto updateEditeur(@PathVariable Long id,@RequestBody EditeurDto editeurDto){
        return iEditeurService.updateEditeur(id,editeurDto);
    }

    @DeleteMapping("/{id}")
    void deleteEditeur(@PathVariable Long id){
        iEditeurService.deleteEditeur(id);
    }

    @GetMapping
    public List<EditeurDto> getEditeur(){
        return iEditeurService.getAll();
    }

    @GetMapping("/{id}")
    public EditeurDto getEditeur(@PathVariable Long id){
        return iEditeurService.getEditeur(id);
    }


}
