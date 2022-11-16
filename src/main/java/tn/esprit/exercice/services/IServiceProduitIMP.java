package tn.esprit.exercice.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exercice.entities.Produit;
import tn.esprit.exercice.entities.Stock;
import tn.esprit.exercice.repository.ProduitRepository;
import tn.esprit.exercice.repository.StockRepository;
@AllArgsConstructor
@Service
public class IServiceProduitIMP extends IServiceGenericIMP<Produit,Long> implements IServiceProduit{
    @Autowired
    ProduitRepository produitRepository;
    @Autowired
    StockRepository stockRepository;

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
        /*recuperation des objets*/
        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        /*verification*/
        if (stock!=null && produit!=null){
            produit.setStock(stock);
            produitRepository.save(produit);
        }
    }
}
