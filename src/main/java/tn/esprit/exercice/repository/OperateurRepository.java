package tn.esprit.exercice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.exercice.entities.Operateur;
import tn.esprit.exercice.entities.Stock;

public interface OperateurRepository extends JpaRepository<Operateur,Long> {
}
