package Empresa.implementations;

import Empresa.entities.Producto;
import Empresa.interfaces.ProductoRepository;

import java.util.List;

public class ProductoRepositoryImpl extends RepositoryImpl<Producto, Long> implements ProductoRepository {

    @Override
    public void add(Producto entity) {
        context.getTransaction().begin();
        context.merge(entity);
        context.getTransaction().commit();

    }

    @Override
    public void update(Producto entity) {

    }

    @Override
    public Producto delete(Long id) {
        return null;
    }

    @Override
    public Producto findBy(Long id) {
        return context.find(Producto.class, id);
    }

    @Override
    public List<Producto> findAll() {
        return null;
    }
}
