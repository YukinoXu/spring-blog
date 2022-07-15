package com.yukinoxu.blog.repository;
import org.springframework.data.repository.CrudRepository;

import com.yukinoxu.blog.entity.User;

public interface UserRepository extends CrudRepository<User, Integer> {
    
}
