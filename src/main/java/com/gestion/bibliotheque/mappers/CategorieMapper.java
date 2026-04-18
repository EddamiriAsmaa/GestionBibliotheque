package com.gestion.bibliotheque.mappers;


import com.gestion.bibliotheque.dtos.CategorieDto;
import com.gestion.bibliotheque.entities.CategorieEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    CategorieEntity toEntity(CategorieDto categorieDto);
    CategorieDto toDto(CategorieEntity categorieEntity);
}
