package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Comment;
import org.example.repository.CommentRepository;
import org.example.repository.impl.CommentRepositoryImpl;
import org.example.service.CommentService;
import org.example.util.HibernateUtil;

import java.util.List;

public class CommentServiceImpl extends BaseEntityServiceImpl<Comment, Long, CommentRepository> implements CommentService {

    private final CommentRepository commentRepository = new CommentRepositoryImpl(HibernateUtil.getEmf().createEntityManager());
    public CommentServiceImpl(CommentRepository repository) {
        super(repository);
    }

    @Override
    public List<Comment> findUser(Long id) {
        try{
            return commentRepository.findUser(id);
        }catch (Exception e){
            return null;
        }
    }
}
