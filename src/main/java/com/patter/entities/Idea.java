package com.patter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.google.gson.Gson;

import javax.persistence.*;

/**
 * Created by iyousuf.
 */

@Entity
@Table(name = "IDEA")
public class Idea {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "IDEA_ID")
    private Long id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "USER_KEY")
    private int userKey;

    protected Idea() {
    }

    public Idea(String title, String description, Integer user_key) {
        this.title = title;
        this.description = description;
        this.userKey = user_key;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUserKey() {
        return userKey;
    }

    public void setUserKey(int userKey) {
        this.userKey = userKey;
    }

    @Override
    public String toString() {
        return "Idea{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", user_key=" + userKey +
                '}';
    }


}
