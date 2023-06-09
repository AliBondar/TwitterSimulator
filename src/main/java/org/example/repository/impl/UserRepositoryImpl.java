package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.User;
import org.example.repository.UserRepository;
import org.example.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.Optional;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<User, Long> implements UserRepository {


    private final EntityManager em;
    public UserRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<User> getEntityClass() {
        return User.class;
    }

    public EntityManager getEm() {
        return em;
    }
}
