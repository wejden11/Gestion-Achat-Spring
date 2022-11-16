package tn.esprit.exercice.services;

import tn.esprit.exercice.entities.Stock;

import java.util.List;

public interface IServiceStock extends IServiceGeneric<Stock,Long>{
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);
}
