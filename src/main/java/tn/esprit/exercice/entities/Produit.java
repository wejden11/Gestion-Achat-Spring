package tn.esprit.exercice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Produit")
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    private String codeProduit;
    private String libelleProduit;
    private float prix;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;
    @ManyToOne
    private Stock stock;
    @ManyToOne
    private CategorieProduit categorieProduit;
}
