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
@Table(name = "Fournisseur")
public class Fournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;
    private String codeFournisseur;
    private String libelleFournisseur;
    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;
    @ManyToMany
    private Set<SecteurActivite> secteurActivites;
    @OneToOne
    private DetailFournisseur detailFournisseur;
}
