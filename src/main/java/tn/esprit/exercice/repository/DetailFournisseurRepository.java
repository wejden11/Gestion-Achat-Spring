package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.DetailFournisseur;
import tn.esprit.exercice.entities.Stock;

public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur,Long> {
}
