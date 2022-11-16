package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.DetailFacture;
import tn.esprit.exercice.entities.Stock;

public interface DetailFactureRepository extends JpaRepository<DetailFacture,Long> {
}
