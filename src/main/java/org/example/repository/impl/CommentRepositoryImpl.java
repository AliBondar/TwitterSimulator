package org.example.repository.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.domain.Comment;
import org.example.domain.Tweet;
import org.example.repository.CommentRepository;

import javax.persistence.EntityManager;
import java.util.List;

public class CommentRepositoryImpl extends BaseEntityRepositoryImpl<Comment, Long> implements CommentRepository {

    private final EntityManager em;
    public CommentRepositoryImpl(EntityManager em) {
        super(em);
        this.em = em;
    }

    @Override
    public Class<Comment> getEntityClass() {
        return Comment.class;
    }

    public EntityManager getEm() {
        return em;
    }

    @Override
    public List<Comment> findUser(Long id) {
        String query = """
                select c from Comment c where c.account.id = :id
                """;
        return em.createQuery(query, Comment.class).setParameter("id", id).getResultList();
    }
}
