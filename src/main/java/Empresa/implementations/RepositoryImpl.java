package Empresa.implementations;

import Empresa.context.DbContext;
import Empresa.interfaces.Repository;
import jakarta.persistence.EntityManager;
import jdk.javadoc.doclet.Reporter;

import javax.swing.text.html.parser.Entity;

public abstract class RepositoryImpl<T,W> implements Repository<T,W> {
    protected final EntityManager context;
    public RepositoryImpl(){
        context = DbContext.getInstance().entityManager;
    }
}
