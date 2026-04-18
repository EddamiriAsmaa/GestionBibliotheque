package com.gestion.bibliotheque.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class LivreEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titre;
    private int pages;
    private LocalDate datePublication;

    @ManyToOne
    private AuteurEntity auteur;

    @ManyToOne
    private CategorieEntity categorie;

    @ManyToOne
    private EditeurEntity editeur;
}
