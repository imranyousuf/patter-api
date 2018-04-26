package com.patter.entities;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

/**
 * Created by iyousuf.
 */

@Entity
@Table(name = "COMMENT")
public class Comment {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "SPACE_ID")
    private Long id;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "UPVOTE")
    private int upVote;

    @Column(name = "DOWNVOTE")
    private int downVote;

    @Column(name = "PARENT")
    private boolean parent;

    @Column(name = "SPACE_ID")
    private int space;

    @Column(name = "USER_KEY")
    private int userKey;

    protected Comment(){

    }


    public Comment(String description, int upVote, int downVote, boolean parent, int space, int userKey) {
        this.description = description;
        this.upVote = upVote;
        this.downVote = downVote;
        this.parent = parent;
        this.space = space;
        this.userKey = userKey;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    public boolean isParent() {
        return parent;
    }

    public void setParent(boolean parent) {
        this.parent = parent;
    }

    public int getSpace() {
        return space;
    }

    public void setSpace(int space) {
        this.space = space;
    }

    public int getUserKey() {
        return userKey;
    }

    public void setUserKey(int userKey) {
        this.userKey = userKey;
    }

    @Override
    public String toString() {
        return "Comment{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                ", parent=" + parent +
                ", space=" + space +
                ", userKey=" + userKey +
                '}';
    }
}
