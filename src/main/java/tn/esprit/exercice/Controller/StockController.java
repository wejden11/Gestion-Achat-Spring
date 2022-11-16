package tn.esprit.exercice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exercice.entities.Produit;
import tn.esprit.exercice.entities.Stock;
import tn.esprit.exercice.services.IServiceStock;

import java.util.List;

@RestController
@RequestMapping("/stock")
public class StockController extends GenericController<Stock,Long>{
    @Autowired
    IServiceStock iServiceStock;


    @PostMapping("/add")
    public Stock addStock(@RequestBody Stock stock) {
        return iServiceStock.addStock(stock);
    }

    @GetMapping("/getall")
    public List<Stock> retrieveAllStocks() {
        return iServiceStock.retrieveAllStocks();
    }

    @GetMapping("/{id}")
    public Stock retrieveStock(@PathVariable Long id) {
        return iServiceStock.retrieveStock(id);
    }

    @PutMapping("/update")
    public Stock updateStock(@RequestBody Stock stock ) {
        return iServiceStock.updateStock( stock);

    }

    @DeleteMapping("/{idS}")
    public void removeStock(@PathVariable Long idS) {
        iServiceStock.removeStock(idS);

    }
}
