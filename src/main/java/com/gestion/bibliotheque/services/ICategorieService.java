package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.CategorieDto;

import java.util.List;

public interface ICategorieService {

    CategorieDto addCategorie(CategorieDto categorieDto);

    CategorieDto updateCategorie(Long id,CategorieDto categorieDto);

    void deleteCategorie(Long id);

    List<CategorieDto> getAll();

    CategorieDto getCategorie(Long id);
}
