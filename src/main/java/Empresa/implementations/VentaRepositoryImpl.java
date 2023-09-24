package Empresa.implementations;

import Empresa.entities.Venta;
import Empresa.interfaces.VentaRepository;

import java.util.List;

public class VentaRepositoryImpl extends RepositoryImpl<Venta,Long> implements VentaRepository {
    @Override
    public void add(Venta entity) {
        context.getTransaction().begin();
        context.merge(entity);
        context.getTransaction().commit();
    }

    @Override
    public void update(Venta entity) {

    }

    @Override
    public Venta delete(Long id) {
        return null;
    }

    @Override
    public Venta findBy(Long id) {
        return context.find(Venta.class, id);
    }

    @Override
    public List<Venta> findAll() {
        return null;
    }
}
