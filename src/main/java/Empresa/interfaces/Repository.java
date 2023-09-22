package Empresa.interfaces;

import java.util.List;

public interface Repository <T,W>{

    void add(T entity);

    void update(T entity);

    T delete(W id);

    T findBy(W id);

    List<T> findAll();
}
