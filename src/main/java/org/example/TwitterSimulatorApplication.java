package org.example;

import org.example.domain.Account;
import org.example.repository.AccountRepository;
import org.example.repository.impl.AccountRepositoryImpl;
import org.example.service.AccountService;
import org.example.service.impl.AccountServiceImpl;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;

public class TwitterSimulatorApplication {
    public static void main(String[] args) {

        Account account = new Account();
        account.setUsername("alibon");
        account.setPassword("1234");
        account.setEmail("alibon@gmail.com");

        //AccountService accountService = new AccountServiceImpl((AccountRepository) new AccountRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
       // EntityManager entityManager = HibernateUtil.getEmf().createEntityManager();
        SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getEmf();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(account);
        session.getTransaction().commit();
        session.close();
        //accountService.save(account);

    }
}