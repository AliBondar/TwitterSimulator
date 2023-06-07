package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.User;

import javax.persistence.EntityManager;

public class UserRepositoryImpl extends BaseEntityRepositoryImpl<User, Long> {


    private final EntityManager em;
    public UserRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<User> getEntityClass() {
        return null;
    }

    public EntityManager getEm() {
        return em;
    }
}
