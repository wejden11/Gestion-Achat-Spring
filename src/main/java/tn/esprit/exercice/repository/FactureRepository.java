package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.Facture;
import tn.esprit.exercice.entities.Stock;

public interface FactureRepository extends JpaRepository<Facture,Long> {
}
