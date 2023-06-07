package org.example;

import org.example.domain.Account;
import org.example.domain.Like;
import org.example.domain.Tweet;
import org.example.domain.User;
import org.example.domain.enumeration.AccountType;
import org.example.domain.enumeration.Gender;
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
import java.util.ArrayList;
import java.util.List;

public class TwitterSimulatorApplication {
    public static void main(String[] args) {

        User user = new User();
        user.setFirstName("ali");
        user.setLastName("bondar");
        user.setGender(Gender.MALE);
        user.setAge(22);
        user.setCountry("Iran");

        Account account = new Account();
        account.setUsername("alibon");
        account.setPassword("1234");
        account.setEmail("alibon@gmail.com");
        account.setAccountType(AccountType.REMEMBERING);
        account.setHasBlueTick(false);

        List<Account> accountList = new ArrayList<>();
        accountList.add(account);
        user.setAccountList(accountList);

        Tweet tweet = new Tweet();
        tweet.setText("Hello World");
        tweet.setNumberOfLikes(20);
        Tweet tweet1 = new Tweet();
        tweet1.setText("Good morning");
        tweet1.setNumberOfLikes(65);
        List<Tweet> tweetList = new ArrayList<>();
        tweetList.add(tweet);
        tweetList.add(tweet1);
        account.setTweetList(tweetList);
        List<Like> likeList = new ArrayList<>();
        Like like1 = new Like();
        likeList.add(like1);
        like1.setAccount(account);
        like1.setTweet(tweet1);
        //tweet.setLikeList(likeList);

        //AccountService accountService = new AccountServiceImpl((AccountRepository) new AccountRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
       // EntityManager entityManager = HibernateUtil.getEmf().createEntityManager();
        SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getEmf();
        Session session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(user);
        session.save(account);
        session.save(tweet);
        session.save(tweet1);
        session.save(like1);
        session.getTransaction().commit();
        session.close();
        //accountService.save(account);

    }
}