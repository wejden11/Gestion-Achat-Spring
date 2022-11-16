package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.SecteurActivite;
import tn.esprit.exercice.entities.Stock;

public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite,Long> {
}
