package com.gestion.bibliotheque.repositories;


import com.gestion.bibliotheque.entities.EditeurEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface EditeurRepository extends JpaRepository<EditeurEntity, Long> {
}
