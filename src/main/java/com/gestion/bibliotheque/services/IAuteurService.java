package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.AuteurDto;

import java.util.List;

public interface IAuteurService {

    AuteurDto addAuteur(AuteurDto auteurDto);
    AuteurDto updateAuteur(Long id,AuteurDto auteurDto);
    void deleteAuteur(Long id);
    List<AuteurDto> getAll();
    AuteurDto getAuteur(Long id);
}
