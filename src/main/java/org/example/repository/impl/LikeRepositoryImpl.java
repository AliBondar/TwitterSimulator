package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Like;
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
}
