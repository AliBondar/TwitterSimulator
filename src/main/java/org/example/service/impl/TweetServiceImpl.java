package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Tweet;
import org.example.repository.TweetRepository;
import org.example.repository.impl.TweetRepositoryImpl;
import org.example.service.TweetService;
import org.example.util.HibernateUtil;

import java.util.List;

public class TweetServiceImpl extends BaseEntityServiceImpl<Tweet, Long, TweetRepository> implements TweetService {

    private final TweetRepository tweetRepository = new TweetRepositoryImpl(HibernateUtil.getEmf().createEntityManager());
    public TweetServiceImpl(TweetRepository repository) {
        super(repository);
    }

    @Override
    public List<Tweet> findUser(Long id) {
        try{
            return tweetRepository.findUser(id);
        }catch (Exception e){
            return null;
        }

    }
}
