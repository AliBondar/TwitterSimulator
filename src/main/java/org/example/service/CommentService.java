package org.example.service;

import org.example.base.service.BaseEntityService;
import org.example.domain.Comment;

import java.util.List;

public interface CommentService extends BaseEntityService<Comment, Long> {

    List<Comment> findUser(Long id);

}
