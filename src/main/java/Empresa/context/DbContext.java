package Empresa.context;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class DbContext {
    private static DbContext context;
    public final EntityManager entityManager;

    private DbContext(){
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("empresa");
        entityManager = entityManagerFactory.createEntityManager();
    }
    public static DbContext getInstance(){
        if(context == null){
            context = new DbContext();
        }
        return context;
    }

}
