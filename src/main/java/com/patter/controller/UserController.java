package com.patter.controller;

import com.patter.entities.Comment;
import com.patter.entities.User;
import com.patter.repos.CommentRepository;
import com.patter.repos.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserRepository repository;

    @RequestMapping(value = "/all")
    public List<User> getAllUser(){
        List<User> users = new ArrayList<>();
        for(User user : repository.findAll()){
            users.add(user);
        }
        return users;
    }

    @RequestMapping(value = "/id/{id}")
    public User getUserByID(@PathVariable(value="id") Long id){
        User user = repository.findById(id);
        //return gson.toJson(idea);
        return user;
    }


    @RequestMapping(value = "/user/{user_name}")
    public User getUserByUserName(@PathVariable(value="user_name") String user_name){
        User user = repository.findByUserName(user_name);
        return user;
    }

}
