package tn.esprit.exercice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.exercice.entities.Produit;
import tn.esprit.exercice.services.IServiceProduit;

@RestController
@RequestMapping("produit")
public class ProduitController extends GenericController<Produit,Long>{
    @Autowired
    IServiceProduit iServiceProduit;

    @PutMapping("/assign/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit, Long idStock) {
    this.iServiceProduit.assignProduitToStock(idProduit,idStock);
    }

}
