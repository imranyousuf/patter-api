package com.patter.entities;



import javax.persistence.*;
import java.util.ArrayList;

/**
 * Created by iyousuf.
 */

@Entity
@Table(name = "SPACE")
public class Space {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "SPACE_ID")
    private long id;

    @Column(name = "IS_GENERAL")
    private boolean isGeneral;

    @Column(name = "USER_ID_LIST")
    private String lstUsers;

    @Column(name = "COMMENT_ID_LIST")
    private String lstComments;

    @Column(name = "IDEA_ID")
    private long idea_key;


    protected Space() {
    }

    public Space(boolean isGeneral, String lstUsers, String lstComments, long idea_key) {
        this.isGeneral = isGeneral;
        this.lstUsers = lstUsers;
        this.lstComments = lstComments;
        this.idea_key = idea_key;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isGeneral() {
        return isGeneral;
    }

    public void setGeneral(boolean general) {
        isGeneral = general;
    }

    public String getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(String lstUsers) {
        this.lstUsers = lstUsers;
    }

    public String getLstComments() {
        return lstComments;
    }

    public void setLstComments(String lstComments) {
        this.lstComments = lstComments;
    }

    public long getIdea_key() {
        return idea_key;
    }

    public void setIdea_key(long idea_key) {
        this.idea_key = idea_key;
    }

    @Override
    public String toString() {
        return "Space{" +
                "id=" + id +
                ", isGeneral=" + isGeneral +
                ", lstUsers=" + lstUsers +
                ", lstComments=" + lstComments +
                ", idea_key=" + idea_key +
                '}';
    }
}
