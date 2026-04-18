package com.gestion.bibliotheque.mappers;


import com.gestion.bibliotheque.dtos.LivreDto;
import com.gestion.bibliotheque.entities.LivreEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface LivreMapper {

    @Mapping(source = "auteur.id", target = "auteurId")
    @Mapping(source = "categorie.id", target = "categorieId")
    @Mapping(source = "editeur.id", target = "editeurId")
    LivreDto toDto(LivreEntity livreEntity);

    @Mapping(target = "auteur", ignore = true)
    @Mapping(target = "categorie", ignore = true)
    @Mapping(target = "editeur", ignore = true)
    LivreEntity toEntity(LivreDto livreDto);

}
