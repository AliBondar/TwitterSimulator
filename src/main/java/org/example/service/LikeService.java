package org.example.service;

import org.example.base.service.BaseEntityService;
import org.example.domain.Like;
import org.example.domain.Tweet;

public interface LikeService extends BaseEntityService<Like, Long> {

    Integer countLikes(Tweet tweet);

}
