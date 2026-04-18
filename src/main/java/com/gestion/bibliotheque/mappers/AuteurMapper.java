package com.gestion.bibliotheque.mappers;

import com.gestion.bibliotheque.dtos.AuteurDto;
import com.gestion.bibliotheque.entities.AuteurEntity;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AuteurMapper {

    AuteurEntity toEntity(AuteurDto auteurDto);
    AuteurDto toDto(AuteurEntity auteurEntity);

}
