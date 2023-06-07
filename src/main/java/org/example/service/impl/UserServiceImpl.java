package org.example.service.impl;

import org.example.base.repository.impl.BaseEntityRepositoryImpl;
import org.example.base.service.impl.BaseEntityServiceImpl;
import org.example.domain.User;
import org.example.repository.UserRepository;
import org.example.repository.impl.UserRepositoryImpl;
import org.example.service.AccountService;
import org.example.service.UserService;

public class UserServiceImpl extends BaseEntityServiceImpl<User, Long, UserRepository> implements UserService {


    public UserServiceImpl(UserRepository repository) {
        super(repository);
    }



//    @Override
//    public void save(User user) {
//        if (user.getId() == null) {
//            try{
//
//            }
//        }
//    }
}
