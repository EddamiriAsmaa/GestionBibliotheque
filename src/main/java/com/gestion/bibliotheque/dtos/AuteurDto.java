package com.gestion.bibliotheque.dtos;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuteurDto {

    private Long id;
    private String nom;
    private String prenom;
}
