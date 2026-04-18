package com.gestion.bibliotheque.services;

import com.gestion.bibliotheque.dtos.CategorieDto;
import com.gestion.bibliotheque.dtos.EditeurDto;
import com.gestion.bibliotheque.mappers.CategorieMapper;
import com.gestion.bibliotheque.repositories.CategorieRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;
@Service
public class CategorieService implements ICategorieService{

    private final CategorieMapper categorieMapper;
    private final CategorieRepository categorieRepository;

    public CategorieService(CategorieMapper categorieMapper, CategorieRepository categorieRepository) {
        this.categorieMapper = categorieMapper;
        this.categorieRepository = categorieRepository;
    }


    @Override
    public CategorieDto addCategorie(CategorieDto categorieDto) {
        return categorieMapper.toDto(categorieRepository.save(categorieMapper.toEntity(categorieDto)));
    }

    @Override
    public CategorieDto updateCategorie(CategorieDto categorieDto) {
        return categorieMapper.toDto(categorieRepository.save(categorieMapper.toEntity(categorieDto)));
    }

    @Override
    public void deleteCategorie(Long id) {
        categorieRepository.deleteById(id);
    }

    @Override
    public List<CategorieDto> getAll() {

        List<CategorieDto> categorie = categorieRepository.findAll()
                .stream()
                .map(categorieMapper::toDto)
                .collect(Collectors.toList());

        if (categorie.isEmpty()) {
            throw new RuntimeException("No livres found");
        }

        return categorie;
    }

    @Override
    public CategorieDto getCategorie(Long id) {
        return categorieRepository.findById(id).map(categorieMapper::toDto).orElseThrow(()->new RuntimeException("not found"));

    }
}
