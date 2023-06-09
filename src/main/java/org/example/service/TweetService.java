package org.example.service;

import org.example.base.service.BaseEntityService;
import org.example.domain.Tweet;

import java.util.List;

public interface TweetService extends BaseEntityService<Tweet, Long> {

    List<Tweet> findUser(Long id);

}
