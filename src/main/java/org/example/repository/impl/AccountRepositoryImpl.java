package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Account;
import org.example.domain.User;
import org.example.repository.AccountRepository;
import org.example.util.HibernateUtil;

import javax.persistence.EntityManager;
import java.util.Optional;

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

    @Override
    public Optional<Account> findUser(String username) {
        String query = """
                select u from Account u where u.username = :username
                """;
        return Optional.ofNullable(HibernateUtil.getEmf().createEntityManager().createQuery(query, Account.class)
                .setParameter("username", username).getSingleResult());
    }

    @Override
    public Optional<Account> findUser(String username, String password) {
        String query = """
                select u from Account u where u.username = :username and u.password = :password
                """;
        return Optional.ofNullable(HibernateUtil.getEmf().createEntityManager().createQuery(query, Account.class)
                .setParameter("username", username).setParameter("password", password).getSingleResult());
    }
}
