package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Tweet;
import org.example.repository.TweetRepository;
import org.example.service.TweetService;

public class TweetServiceImpl extends BaseEntityServiceImpl<Tweet, Long, TweetRepository> implements TweetService {

    public TweetServiceImpl(TweetRepository repository) {
        super(repository);
    }
}
