package com.gestion.bibliotheque.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class EditeurEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id ;

   private String nom ;
   private String address ;

   @OneToMany(mappedBy = "categorie")
    private List<LivreEntity> livres;
}
