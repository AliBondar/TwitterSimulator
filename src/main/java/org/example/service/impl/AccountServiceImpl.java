package org.example.service.impl;

import org.example.base.service.BaseEntityService;
import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Account;
import org.example.repository.AccountRepository;
import org.example.service.AccountService;

public class AccountServiceImpl extends BaseEntityServiceImpl<Account, Long, AccountRepository> implements AccountService{


    public AccountServiceImpl(AccountRepository repository) {
        super(repository);
    }
}
