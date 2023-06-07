package org.example.service.impl;

import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.Like;
import org.example.repository.LikeRepository;
import org.example.service.LikeService;

public class LikeServiceImpl extends BaseEntityServiceImpl<Like, Long, LikeRepository> implements LikeService {

    public LikeServiceImpl(LikeRepository repository) {
        super(repository);
    }
}
