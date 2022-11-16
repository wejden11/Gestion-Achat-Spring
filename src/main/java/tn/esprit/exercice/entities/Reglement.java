package tn.esprit.exercice.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Reglement")
public class Reglement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;
    private boolean payee;

    @ManyToOne
    private Facture facture;
}
