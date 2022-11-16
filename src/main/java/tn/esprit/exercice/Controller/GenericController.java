package tn.esprit.exercice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.exercice.services.IServiceGeneric;

import java.util.List;

public class GenericController<T,ID> {
    @Autowired
    IServiceGeneric<T,ID> iGenericService;

    @PostMapping
    public T create(@RequestBody T entity) {
        return iGenericService.save(entity);
    }

    @GetMapping
    public List<T> read() {
        return iGenericService.findAll();
    }

    @PutMapping
    public T update(@RequestBody T entity) {
        return iGenericService.save(entity);
    }

    @GetMapping("/{idT}")
    public T read_T(@PathVariable ID idT) {
        return iGenericService.findByID(idT);
    }


    @DeleteMapping("/{idT}")
    public void delete(@PathVariable ID idT) {
        iGenericService.delete(idT);
    }

}
