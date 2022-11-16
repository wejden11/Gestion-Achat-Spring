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
@Table(name = "SecteurActivite")
public class SecteurActivite {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite;
    private String codeSecteurActivite;
    private String libelleSecteurActivite;

    @ManyToMany(mappedBy = "secteurActivites")
    private Set<Fournisseur> fournisseurs;
}
