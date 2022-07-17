package com.yukinoxu.blog.repository;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.repository.CrudRepository;

import com.yukinoxu.blog.entity.User;

public interface UserRepository extends CrudRepository<User, UUID> {
    List<User> findByUsername(String username);
    Optional<User> findById(UUID id);
}
