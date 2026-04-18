package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.EditeurDto;
import com.gestion.bibliotheque.mappers.EditeurMapper;
import com.gestion.bibliotheque.repositories.EditeurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EditeurService implements IEditeurService{

    private final EditeurMapper editeurMapper;
    private final EditeurRepository editeurRepository;

    public EditeurService(EditeurMapper editeurMapper, EditeurRepository editeurRepository) {
        this.editeurMapper = editeurMapper;
        this.editeurRepository = editeurRepository;
    }


    @Override
    public EditeurDto addEditeur(EditeurDto editeurDto) {
        return editeurMapper.toDto(editeurRepository.save(editeurMapper.toEntity(editeurDto)));
    }

    @Override
    public EditeurDto updateEditeur(EditeurDto editeurDto) {
        return editeurMapper.toDto(editeurRepository.save(editeurMapper.toEntity(editeurDto)));
    }

    @Override
    public void deleteEditeur(Long id) {
        editeurRepository.deleteById(id);
    }

    @Override
    public List<EditeurDto> getAll() {

        List<EditeurDto> editeur = editeurRepository.findAll()
                .stream()
                .map(editeurMapper::toDto)
                .collect(Collectors.toList());

        if (editeur.isEmpty()) {
            throw new RuntimeException("No livres found");
        }

        return editeur;
    }

    @Override
    public EditeurDto getEditeur(Long id) {
        return editeurRepository.findById(id).map(editeurMapper::toDto).orElseThrow(()->new RuntimeException("not found"));

    }
}
