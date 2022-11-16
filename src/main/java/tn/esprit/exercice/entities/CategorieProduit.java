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
@Table(name = "CategorieProduit")
public class CategorieProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorieProduit;
    private  String codeProduit;
    private String libelleCategorieProduit;

    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produits;
}
