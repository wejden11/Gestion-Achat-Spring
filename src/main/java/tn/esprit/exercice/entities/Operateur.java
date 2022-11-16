package tn.esprit.exercice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Operateur")
public class Operateur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idOperateur;
    private String nom;
    private String prenom;
    private String password;

    @OneToMany
    private Set<Facture> factures;
}
