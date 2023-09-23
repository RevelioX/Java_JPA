package Empresa.implementations;

import Empresa.entities.Cliente;
import Empresa.interfaces.ClienteRepository;
import com.mysql.cj.xdevapi.Client;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;

import java.util.List;

public class ClienteRepositoryImpl extends RepositoryImpl<Cliente,Long> implements ClienteRepository {

    @Override
    public void add(Cliente entity) {
        context.getTransaction().begin();
        context.merge(entity);
        context.getTransaction().commit();
    }

    @Override
    public void update(Cliente entity) {
        context.getTransaction().begin();
        context.merge(entity);
        context.getTransaction().commit();
    }

    @Override
    public Cliente delete(Long id) {
        return null;
    }

    @Override
    public Cliente findBy(Long id) {
        return context.find(Cliente.class, id);
    }

    @Override
    public List<Cliente> findAll() {
        CriteriaBuilder criteriaBuilder = context.getCriteriaBuilder();
        CriteriaQuery<Cliente> query = criteriaBuilder.createQuery(Cliente.class);
        Root<Cliente> root = query.from(Cliente.class);
        query.select(root);
        return context.createQuery(query).getResultList();
    }
}
