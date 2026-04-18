package com.gestion.bibliotheque.repositories;


import com.gestion.bibliotheque.entities.CategorieEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategorieRepository extends JpaRepository<CategorieEntity,Long> {
}
