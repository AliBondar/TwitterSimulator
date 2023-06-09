package org.example.service;

import org.example.base.service.BaseEntityService;
import org.example.domain.Account;

import java.util.List;
import java.util.Optional;

public interface AccountService extends BaseEntityService<Account, Long> {

    Optional<Account> findUser(String username);

    Optional<Account> findUser(String username, String password);

}
