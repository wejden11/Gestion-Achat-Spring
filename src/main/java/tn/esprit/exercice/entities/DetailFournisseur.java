package tn.esprit.exercice.entities;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DetailFournisseur")
public class DetailFournisseur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur;
    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;
    private String adresse;
    private String matricule;

    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur fournisseur;
}
