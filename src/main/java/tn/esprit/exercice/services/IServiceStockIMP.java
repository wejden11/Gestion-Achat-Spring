package tn.esprit.exercice.services;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.exercice.entities.Stock;
import tn.esprit.exercice.repository.StockRepository;

import java.util.List;

@AllArgsConstructor
@Service
public class IServiceStockIMP extends IServiceGenericIMP<Stock,Long> implements IServiceStock  {
    @Autowired
    StockRepository stockRepository;

    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);
    }
}
