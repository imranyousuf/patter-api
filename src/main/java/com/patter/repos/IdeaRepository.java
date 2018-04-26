package com.patter.repos;

import com.patter.entities.Idea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IdeaRepository extends CrudRepository<Idea, Long> {

    Idea findById(Long id);

    List<Idea> findByUserKey(Integer user_key);

}
