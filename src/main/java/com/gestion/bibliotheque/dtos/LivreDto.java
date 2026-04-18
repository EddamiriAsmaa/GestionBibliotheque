package com.gestion.bibliotheque.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LivreDto {

    private Long id;
    private String titre;
    private int pages;
    private LocalDate datePublication;

    private Long auteurId;
    private Long categorieId;
    private Long editeurId;
}