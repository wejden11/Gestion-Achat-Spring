package tn.esprit.exercice.services;

import java.util.List;

public interface IServiceGeneric<T,ID> {
    public List<T> findAll();

    public T save(T entity);

    public void delete(ID id);

    public T findByID(ID id);
}
