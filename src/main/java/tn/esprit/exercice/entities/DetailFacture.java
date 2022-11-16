package tn.esprit.exercice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DetailFacture")
public class DetailFacture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;
    private Integer qteCommande;
    private float prixTotalDetail;
    private Integer pourcentageRemise;
    private float montantRemise;

    @ManyToOne
    private Facture facture;
    @ManyToOne
    private Produit produit;
}
