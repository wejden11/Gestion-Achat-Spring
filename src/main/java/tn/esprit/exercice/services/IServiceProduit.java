package tn.esprit.exercice.services;

import tn.esprit.exercice.entities.Produit;
import tn.esprit.exercice.entities.Stock;

public interface IServiceProduit extends IServiceGeneric<Produit,Long>{
    void assignProduitToStock(Long idProduit, Long idStock);
}
