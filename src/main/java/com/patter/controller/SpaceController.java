package com.patter.controller;

import com.patter.entities.Comment;
import com.patter.entities.Space;
import com.patter.repos.SpaceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/space")
public class SpaceController {

    @Autowired
    private SpaceRepository repository;

    @RequestMapping(value = "/all")
    public List<Space> getAllSpaces(){
        List<Space> spaces = new ArrayList<>();
        for(Space space : repository.findAll()){
            spaces.add(space);
        }
        return spaces;
    }

//    @RequestMapping(value = "/general")
//    public List<Space> getAllGeneralSpaces(){
//        List<Space> spaces = new ArrayList<>();
//        for(Space space : repository.findByGeneralIs()){
//            spaces.add(space);
//        }
//        return spaces;
//    }

    @RequestMapping(value = "/id/{id}")
    public Space getSapceByID(@PathVariable(value="id") Long id){
        Space space = repository.findById(id);
        //return gson.toJson(idea);
        return space;
    }

//
//    @RequestMapping(value = "/user/{user_id}")
//    public List<Space> getSpaceByUser(@PathVariable(value="user_id") Integer user_id){
//        List<Space> spaces = repository.findByUserKey(user_id);
//        return spaces;
//    }


    @RequestMapping(value = "/id", method = RequestMethod.POST)
    public String createComment(@RequestBody Space space){
        //if comment exist logic
        repository.save(space);
        return Long.toString(space.getId());

    }

    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public String deleteIdea(@RequestBody Space space){
        //if comment exist logic
        repository.delete(space);
        return Long.toString(space.getId());

    }


}
