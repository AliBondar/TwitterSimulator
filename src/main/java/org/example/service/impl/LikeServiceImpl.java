package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Like;
import org.example.domain.Tweet;
import org.example.repository.LikeRepository;
import org.example.repository.impl.LikeRepositoryImpl;
import org.example.service.LikeService;
import org.example.util.HibernateUtil;

public class LikeServiceImpl extends BaseEntityServiceImpl<Like, Long, LikeRepository> implements LikeService {


    private final LikeRepository likeRepository = new LikeRepositoryImpl(HibernateUtil.getEmf().createEntityManager());
    public LikeServiceImpl(LikeRepository repository) {
        super(repository);
    }

    @Override
    public Integer countLikes(Tweet tweet) {
        try{
            return likeRepository.countLikes(tweet);
        }catch (Exception e){
            return null;
        }
    }
}
