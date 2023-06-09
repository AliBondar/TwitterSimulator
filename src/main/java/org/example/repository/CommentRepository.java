package org.example.repository;

import org.example.base.repository.BaseEntityRepository;
import org.example.domain.Comment;
import org.example.domain.Tweet;

import java.util.List;

public interface CommentRepository extends BaseEntityRepository<Comment, Long> {

    List<Comment> findUser(Long id);
}
