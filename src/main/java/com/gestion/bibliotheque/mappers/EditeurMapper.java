package com.gestion.bibliotheque.mappers;


import com.gestion.bibliotheque.dtos.EditeurDto;
import com.gestion.bibliotheque.entities.EditeurEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface EditeurMapper {
    EditeurEntity toEntity(EditeurDto editeurDto);
    EditeurDto toDto(EditeurEntity editeurEntity);
}
