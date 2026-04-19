package com.gestion.bibliotheque.services;


import com.gestion.bibliotheque.dtos.EditeurDto;

import java.util.List;

public interface IEditeurService {

    EditeurDto addEditeur(EditeurDto editeurDto);

    EditeurDto updateEditeur(Long id,EditeurDto editeurDto);

    void deleteEditeur(Long id);

    List<EditeurDto> getAll();

    EditeurDto getEditeur(Long id);
}
