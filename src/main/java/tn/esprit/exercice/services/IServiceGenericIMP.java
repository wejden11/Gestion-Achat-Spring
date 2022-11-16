package tn.esprit.exercice.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public class IServiceGenericIMP<T,ID> implements IServiceGeneric<T,ID>{
    @Autowired
    JpaRepository<T,ID> genericRepository;

    @Override
    public List<T> findAll() {
        return genericRepository.findAll();
    }

    @Override
    public T save(T entity) {
        return genericRepository.save(entity);
    }

    @Override
    public void delete(ID id) {genericRepository.deleteById(id);

    }

    @Override
    public T findByID(ID id) {
        return genericRepository.findById(id).orElse(null);
    }
}
