package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Tweet;

import javax.persistence.EntityManager;

public class TweetRepositoryImpl extends BaseEntityRepositoryImpl<Tweet, Long> {

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
}
