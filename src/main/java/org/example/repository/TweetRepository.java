package org.example.repository;

import org.example.base.repository.BaseEntityRepository;
import org.example.domain.Tweet;

import java.util.List;

public interface TweetRepository extends BaseEntityRepository<Tweet, Long> {

    List<Tweet> findUser(Long id);
}
