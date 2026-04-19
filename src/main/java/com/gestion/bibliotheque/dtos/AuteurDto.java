package com.gestion.bibliotheque.dtos;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuteurDto {

    private Long id;
    private String nom;
    private String prenom;
}
