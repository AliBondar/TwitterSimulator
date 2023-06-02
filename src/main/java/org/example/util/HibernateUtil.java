package org.example.util;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

    private EntityManagerFactory emf;

    public EntityManagerFactory getEmf() {
        if(emf == null)
            emf = Persistence.createEntityManagerFactory("default");
        return emf;
    }

}
