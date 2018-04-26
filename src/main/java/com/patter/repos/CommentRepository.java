package com.patter.repos;

import com.patter.entities.Comment;
import com.patter.entities.Idea;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CommentRepository extends CrudRepository<Comment, Long> {
    Comment findById(Long id);
    List<Comment> findByUserKey(Integer user_key);
    Comment findBySpace(Integer space_id);


}
