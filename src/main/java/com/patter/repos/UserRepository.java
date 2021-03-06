package com.patter.repos;

import com.patter.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Long>{

    User findById(Long id);

    User findByUserName(String name);
}
