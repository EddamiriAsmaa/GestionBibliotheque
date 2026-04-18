package com.gestion.bibliotheque.repositories;

import com.gestion.bibliotheque.entities.AuteurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuteurRepository extends JpaRepository<AuteurEntity, Long> {
}
