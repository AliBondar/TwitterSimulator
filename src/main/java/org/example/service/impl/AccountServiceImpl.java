package org.example.service.impl;

import org.example.base.service.BaseEntityService;
import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Account;
import org.example.repository.AccountRepository;
import org.example.repository.UserRepository;
import org.example.repository.impl.AccountRepositoryImpl;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.AccountService;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;

import java.util.Optional;

public class AccountServiceImpl extends BaseEntityServiceImpl<Account, Long, AccountRepository> implements AccountService{

    private final AccountRepository accountRepository = new AccountRepositoryImpl(HibernateUtil.getEmf().createEntityManager());

    public AccountServiceImpl(AccountRepository repository) {
        super(repository);
    }
    @Override
    public Optional<Account> findUser(String username) {
        try {
            return accountRepository.findUser(username);
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    @Override
    public Optional<Account> findUser(String username, String password) {
        try {
        return accountRepository.findUser(username, password);
    } catch (Exception e) {
        return Optional.empty();
    }
    }
}
