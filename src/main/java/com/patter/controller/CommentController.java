package com.patter.controller;

import com.patter.entities.Comment;
import com.patter.entities.Idea;
import com.patter.repos.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/comment")
public class CommentController {

    @Autowired
    private CommentRepository repository;


    @RequestMapping(value = "/all")
    public List<Comment> getAllIdeas(){
        List<Comment> comments = new ArrayList<>();
        for(Comment comment : repository.findAll()){
            comments.add(comment);
        }
        return comments;
    }

    @RequestMapping(value = "/id/{id}")
    public Comment getIdeaByID(@PathVariable(value="id") Long id){
        Comment comment = repository.findById(id);
        //return gson.toJson(idea);
        return comment;
    }


    @RequestMapping(value = "/user/{user_id}")
    public List<Idea> getIdeaByUser(@PathVariable(value="user_id") Integer user_id){
        List<Idea> idea = repository.findByUserKey(user_id);
        return idea;
    }

    @RequestMapping(value = "/id", method = RequestMethod.POST)
    public String createIdea(@RequestBody Idea idea){
        //if idea exist logic
        repository.save(idea);
        return idea.getId().toString();

    }

    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public String deleteIdea(@RequestBody Idea idea){
        //if idea exist logic
        repository.delete(idea);
        return idea.getId().toString();

    }

}
