package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.AuteurDto;
import com.gestion.bibliotheque.mappers.AuteurMapper;
import com.gestion.bibliotheque.repositories.AuteurRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuteurService implements IAuteurService{

    private final AuteurMapper auteurMapper;
    private final AuteurRepository auteurRepository;

    public AuteurService(AuteurMapper auteurMapper, AuteurRepository auteurRepository) {
        this.auteurMapper = auteurMapper;
        this.auteurRepository = auteurRepository;
    }


    @Override
    public AuteurDto addAuteur(AuteurDto auteurDto) {
        return auteurMapper.toDto(auteurRepository.save(auteurMapper.toEntity(auteurDto)));
    }

    @Override
    public AuteurDto updateAuteur(AuteurDto auteurDto) {
        return auteurMapper.toDto(auteurRepository.save(auteurMapper.toEntity(auteurDto)));
    }

    @Override
    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }

    @Override
    public List<AuteurDto> getAll() {
        List<AuteurDto> auteur = auteurRepository.findAll()
                .stream()
                .map(auteurMapper::toDto)
                .collect(Collectors.toList());

        if (auteur.isEmpty()) {
            throw new RuntimeException("No livres found");
        }

        return auteur;         }

    @Override
    public AuteurDto getAuteur(Long id) {
        return auteurRepository.findById(id).map(auteurMapper::toDto).orElseThrow(()->new RuntimeException("not found"));

    }
}
