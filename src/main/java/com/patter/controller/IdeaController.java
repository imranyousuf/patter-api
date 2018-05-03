package com.patter.controller;


import com.google.gson.Gson;
import com.patter.Application;
import com.patter.entities.Idea;
import com.patter.repos.IdeaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/idea")
public class IdeaController {
    private static final Logger log = LoggerFactory.getLogger(IdeaController.class);

    @Autowired
    private IdeaRepository repository;


    @RequestMapping(value = "/all")
    public List<Idea> getAllIdeas(){
        List<Idea> allIdeas = new ArrayList<>();
        for(Idea idea : repository.findAll()){
            allIdeas.add(idea);
        }
        return allIdeas;
    }

    @RequestMapping(value = "/id/{id}")
    public Idea getIdeaByID(@PathVariable(value="id") Long id){
        Idea idea = repository.findById(id);
        //return gson.toJson(idea);
        return idea;
    }


    @RequestMapping(value = "/user/{user_id}")
    public List<Idea> getIdeaByUser(@PathVariable(value="user_id") Integer user_id){
        List<Idea> idea = repository.findByUserKey(user_id);
        return idea;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
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
