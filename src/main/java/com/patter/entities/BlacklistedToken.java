package com.patter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;

import javax.persistence.*;

/**
 * Created by snizam.
 */

@Entity
@Table(name = "BLACKLISTED_TOKEN")
public class BlacklistedToken {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "BLACKLISTED_TOKEN_ID")
    private Long id;

    @Column(name = "TOKEN")
    private String token;

    protected BlacklistedToken() {
    }

    public BlacklistedToken(String token) {
        this.token = token;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "BlacklistedToken{" +
                "id=" + id +
                ", token='" + token +
                '}';
    }

}
