package org.example.base.service.impl;

import org.example.base.domain.BaseEntity;
import org.example.base.repository.BaseEntityRepository;
import org.example.base.service.BaseEntityService;

import java.io.Serializable;
import java.util.List;

public class BaseEntityServiceImpl<T extends BaseEntity<ID>, ID extends Serializable, R extends BaseEntityRepository<T, ID>>
        implements BaseEntityService<T, ID> {

    private final R repository;

    public BaseEntityServiceImpl(R repository) {
        this.repository = repository;
    }

    @Override
    public void save(T t) {

    }

    @Override
    public void delete(T t) {

    }

    @Override
    public void deleteById(ID id) {

    }

    @Override
    public T findById(ID id) {
        return null;
    }

    @Override
    public List<T> findAll() {
        return null;
    }

    @Override
    public void update(T t) {

    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void beginTransaction() {

    }

    @Override
    public void commitTransaction() {

    }

    @Override
    public void rollbackTransaction() {

    }
}
