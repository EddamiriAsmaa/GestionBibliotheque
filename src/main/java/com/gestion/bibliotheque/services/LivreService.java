package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.LivreDto;
import com.gestion.bibliotheque.entities.LivreEntity;
import com.gestion.bibliotheque.mappers.LivreMapper;
import com.gestion.bibliotheque.repositories.AuteurRepository;
import com.gestion.bibliotheque.repositories.CategorieRepository;
import com.gestion.bibliotheque.repositories.EditeurRepository;
import com.gestion.bibliotheque.repositories.LivreRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class LivreService implements ILivreService{

    private final LivreMapper livreMapper;
    private final LivreRepository livreRepository;
    private final AuteurRepository auteurRepository;
    private final CategorieRepository categorieRepository;
    private final EditeurRepository editeurRepository;

    public LivreService(LivreMapper livreMapper,
                        LivreRepository livreRepository,
                        AuteurRepository auteurRepository,
                        CategorieRepository categorieRepository,
                        EditeurRepository editeurRepository) {

        this.livreMapper = livreMapper;
        this.livreRepository = livreRepository;
        this.auteurRepository = auteurRepository;
        this.categorieRepository = categorieRepository;
        this.editeurRepository = editeurRepository;
    }

    @Override
    public LivreDto addLivre(LivreDto livreDto) {

        LivreEntity livre = livreMapper.toEntity(livreDto);

        livre.setAuteur(
                auteurRepository.findById(livreDto.getAuteurId())
                        .orElseThrow(() -> new RuntimeException("Auteur not found"))
        );

        livre.setCategorie(
                categorieRepository.findById(livreDto.getCategorieId())
                        .orElseThrow(() -> new RuntimeException("Categorie not found"))
        );

        livre.setEditeur(
                editeurRepository.findById(livreDto.getEditeurId())
                        .orElseThrow(() -> new RuntimeException("Editeur not found"))
        );

        return livreMapper.toDto(livreRepository.save(livre));
    }

    @Override
    public LivreDto updateLivre(LivreDto livreDto) {

        LivreEntity livre = livreMapper.toEntity(livreDto);

        livre.setAuteur(
                auteurRepository.findById(livreDto.getAuteurId())
                        .orElseThrow(() -> new RuntimeException("Auteur not found"))
        );

        livre.setCategorie(
                categorieRepository.findById(livreDto.getCategorieId())
                        .orElseThrow(() -> new RuntimeException("Categorie not found"))
        );

        livre.setEditeur(
                editeurRepository.findById(livreDto.getEditeurId())
                        .orElseThrow(() -> new RuntimeException("Editeur not found"))
        );

        return livreMapper.toDto(livreRepository.save(livre));
    }

    @Override
    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }

    @Override
    public List<LivreDto> getAll() {

        List<LivreDto> livres = livreRepository.findAll()
                .stream()
                .map(livreMapper::toDto)
                .collect(Collectors.toList());

        if (livres.isEmpty()) {
            throw new RuntimeException("No livres found");
        }

        return livres;
    }

    @Override
    public LivreDto getLivre(Long id) {
        return livreRepository.findById(id).map(livreMapper::toDto).orElseThrow(()->new RuntimeException("not found"));

    }
}

