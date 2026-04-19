package com.gestion.bibliotheque.entities;


import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class AuteurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    //Relations : 1-N avec Livre
   @OneToMany(mappedBy = "auteur")
    private List<LivreEntity> livres ;

}