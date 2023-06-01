package org.example.base.repository.impl;

import org.example.base.domain.BaseEntity;
import org.example.base.repository.BaseEntityRepository;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import java.io.Serializable;
import java.util.List;


public abstract class BaseEntityRepositoryImpl<T extends BaseEntity<ID>, ID extends Serializable> implements BaseEntityRepository<T,ID> {


    private final EntityManager em;

    public BaseEntityRepositoryImpl(EntityManager em) {
        this.em = em;
    }


    @Override
    public void save(T t) {
        if (t.getId() == null) {
            em.persist(t);
        } else {
            em.merge(t);
        }
    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteById(ID id) {
        beginTransaction();
        try {
            em.remove(findById(id));
        } catch (Exception e) {
            throw new RuntimeException("entity not found");
        }
    }

    @Override
    public T findById(ID id) {
        return em.find(getEntityClass(), id);
    }

    @Override
    public List<T> findAll() {
        return em.createQuery(" from " + getEntityClass().getSimpleName(), getEntityClass()).getResultList();
    }

    @Override
    public void update(T t) {

    }

    @Override
    public void beginTransaction() {
        EntityTransaction transaction = em.getTransaction();
        if (!transaction.isActive()) {
            transaction.begin();
        }
    }

    @Override
    public void commitTransaction() {
        EntityTransaction transaction = em.getTransaction();
        if (transaction.isActive()) {
            transaction.commit();
        }
    }

    @Override
    public void rollbackTransaction() {
        EntityTransaction transaction = em.getTransaction();
        if (transaction.isActive()) {
            transaction.rollback();
        }
    }

    public abstract Class<T> getEntityClass();
}
