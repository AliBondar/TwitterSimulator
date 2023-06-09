package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Comment;
import org.example.domain.Tweet;
import org.example.repository.TweetRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class TweetRepositoryImpl extends BaseEntityRepositoryImpl<Tweet, Long> implements TweetRepository {

    private final EntityManager em;
    public TweetRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<Tweet> getEntityClass() {
        return Tweet.class;
    }

    public EntityManager getEm() {
        return em;
    }

    @Override
    public List<Tweet> findUser(Long id) {
        String query = """
                select t from Tweet t where t.account.id = :id
                """;
        return em.createQuery(query, Tweet.class).setParameter("id" , id).getResultList();
    }

}
