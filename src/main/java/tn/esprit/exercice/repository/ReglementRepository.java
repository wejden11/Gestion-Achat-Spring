package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.Reglement;
import tn.esprit.exercice.entities.Stock;

public interface ReglementRepository extends JpaRepository<Reglement,Long> {
}
