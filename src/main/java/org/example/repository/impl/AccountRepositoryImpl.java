package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Account;
import org.example.repository.AccountRepository;

import javax.persistence.EntityManager;

public class AccountRepositoryImpl extends BaseEntityRepositoryImpl<Account, Long> implements AccountRepository {


    private final EntityManager em;
    public AccountRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<Account> getEntityClass() {
        return Account.class;
    }

    public EntityManager getEm() {
        return em;
    }
}
