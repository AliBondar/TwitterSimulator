package org.example;

import org.example.domain.*;
import org.example.domain.enumeration.AccountType;
import org.example.domain.enumeration.Gender;
import org.example.repository.AccountRepository;
import org.example.repository.impl.*;
import org.example.service.*;
import org.example.service.impl.*;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import javax.persistence.EntityManager;
import java.time.LocalDate;
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
        tweet.setLocalDate(LocalDate.of(2023, 5,13));
        tweet.setNumberOfLikes(20);
        Tweet tweet1 = new Tweet();
        tweet1.setText("Good morning");
        tweet1.setLocalDate(LocalDate.of(2023, 9,18));
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
        Comment comment = new Comment();
        comment.setText("that was nice");
        comment.setLocalDate(LocalDate.of(2023,10,3));
        comment.setTweet(tweet);
        comment.setAccount(account);

        //*******************************
        AccountService accountService = new AccountServiceImpl(new AccountRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        UserService userService = new UserServiceImpl(new UserRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        TweetService tweetService = new TweetServiceImpl(new TweetRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        CommentService commentService = new CommentServiceImpl(new CommentRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        LikeService likeService = new LikeServiceImpl(new LikeRepositoryImpl(HibernateUtil.getEmf().createEntityManager()));
        userService.save(user);
 //      accountService.save(account);
//        tweetService.save(tweet);
//        tweetService.save(tweet1);
//        likeService.save(like1);
//        commentService.save(comment);

//        EntityManager entityManager = HibernateUtil.getEmf().createEntityManager();
//        SessionFactory sessionFactory = (SessionFactory) HibernateUtil.getEmf();
//        Session session = sessionFactory.openSession();
//        session.beginTransaction();
//        session.save(user);
//        session.save(account);
//        session.save(tweet);
//        session.save(tweet1);
//        session.save(like1);
//        session.save(comment);
//        session.getTransaction().commit();
//        session.close();



    }
}