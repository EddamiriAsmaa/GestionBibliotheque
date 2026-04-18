package com.gestion.bibliotheque.dtos;

import com.gestion.bibliotheque.entities.LivreEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class EditeurDto {

    private Long id ;
    private String nom ;
    private String address ;
}
