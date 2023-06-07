package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Comment;
import org.example.repository.CommentRepository;
import org.example.service.CommentService;

public class CommentServiceImpl extends BaseEntityServiceImpl<Comment, Long, CommentRepository> implements CommentService {

    public CommentServiceImpl(CommentRepository repository) {
        super(repository);
    }
}
