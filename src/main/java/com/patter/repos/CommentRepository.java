package com.patter.repos;

import com.patter.entities.Comment;
import com.patter.entities.Idea;
import org.springframework.data.repository.CrudRepository;

public interface CommentRepository extends CrudRepository<Comment, Long> {
}
