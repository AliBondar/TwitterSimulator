package org.example.repository;


import org.example.base.repository.BaseEntityRepository;
import org.example.domain.Account;
import org.example.domain.User;

import java.util.Optional;

public interface AccountRepository extends BaseEntityRepository<Account, Long> {


    Optional<Account> findUser(String username);

    Optional<Account> findUser(String username, String password);
}
