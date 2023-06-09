package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Like;
import org.example.domain.Tweet;
import org.example.repository.LikeRepository;

import javax.persistence.EntityManager;

public class LikeRepositoryImpl extends BaseEntityRepositoryImpl<Like, Long> implements LikeRepository {

    private final EntityManager em;

    public LikeRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }


    @Override
    public Class<Like> getEntityClass() {
        return Like.class;
    }

    public EntityManager getEm() {
        return em;
    }

    @Override
    public Integer countLikes(Tweet tweet) {
        String query = """
                select count(*) from Like l where l.tweet.id = :tweet
                """;
        return em.createQuery(query, Like.class).setParameter("tweet", tweet.getId()).getResultList().size();
    }
}
