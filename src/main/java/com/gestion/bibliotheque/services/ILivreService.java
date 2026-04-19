package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.LivreDto;

import java.util.List;

public interface ILivreService {
    LivreDto addLivre(LivreDto livreDto);

    LivreDto updateLivre(Long id,LivreDto livreDto);

    void deleteLivre(Long id);

    List<LivreDto> getAll();

    LivreDto getLivre(Long id);
}
