package org.example;

import org.example.domain.Account;
import org.example.repository.AccountRepository;
import org.example.repository.impl.AccountRepositoryImpl;
import org.example.service.AccountService;
import org.example.service.impl.AccountServiceImpl;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;

public class TwitterSimulatorApplication {
    public static void main(String[] args) {

        Account account = new Account();
        account.setUsername("alibon");
        account.setPassword("1234");
        account.setEmail("alibon@gmail.com");
        HibernateUtil hibernateUtil = new HibernateUtil();
        AccountService accountService = new AccountServiceImpl((AccountRepository) new AccountRepositoryImpl(hibernateUtil.getEmf().createEntityManager()));
        accountService.save(account);

    }
}