package org.example.repository;

import org.example.base.repository.BaseEntityRepository;
import org.example.domain.Like;
import org.example.domain.Tweet;

public interface LikeRepository extends BaseEntityRepository<Like, Long> {

    Integer countLikes(Tweet tweet);
}
