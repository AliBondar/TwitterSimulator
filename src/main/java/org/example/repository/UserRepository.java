package org.example.repository;

import org.example.base.repository.BaseEntityRepository;
import org.example.domain.User;

import java.util.Optional;

public interface UserRepository extends BaseEntityRepository<User, Long> {
}
