package com.patter.controller;


import com.google.gson.Gson;
import com.patter.Application;
import com.patter.entities.BlacklistedToken;
import com.patter.repos.BlacklistedTokenRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Id;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/v1/blacklisted_token")
public class BlacklistedTokenController {

    @Autowired
    private BlacklistedTokenRepository repository;


    @RequestMapping(value = "/all")
    public List<BlacklistedToken> getAllBlacklistedTokens(){
        List<BlacklistedToken> allTokens = new ArrayList<>();
        for(BlacklistedToken token : repository.findAll()){
            allTokens.add(token);
        }
        return allTokens;
    }


    @RequestMapping(value = "/id/{id}")
    public BlacklistedToken getTokenByID(@PathVariable(value="id") Long id){
        BlacklistedToken token = repository.findById(id);
        return token;
    }


    @RequestMapping(value = "/token/{bl_token}")
    public List<BlacklistedToken> getTokenByTokenString(@PathVariable(value="bl_token") String bl_token){
        List<BlacklistedToken> token = repository.findByTokenString(bl_token);
        return token;
    }


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String createToken(@RequestBody BlacklistedToken token){
        //if idea exist logic
        repository.save(token);
        return token.getId().toString();
    }


    @RequestMapping(value = "/id", method = RequestMethod.DELETE)
    public String deleteToken(@RequestBody BlacklistedToken token){
        //if idea exist logic
        repository.delete(token);
        return token.getId().toString();

    }

}
