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
    private long id;

    private boolean isGeneral;

    private ArrayList<Integer> lstUsers;

    private ArrayList<Integer> lstComments;

    private Integer idea_key;


    protected Space() {
    }

    public Space(long id, boolean isGeneral, ArrayList<Integer> lstUsers, ArrayList<Integer> lstComments, Integer idea_key) {
        this.id = id;
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

    public ArrayList<Integer> getLstUsers() {
        return lstUsers;
    }

    public void setLstUsers(ArrayList<Integer> lstUsers) {
        this.lstUsers = lstUsers;
    }

    public ArrayList<Integer> getLstComments() {
        return lstComments;
    }

    public void setLstComments(ArrayList<Integer> lstComments) {
        this.lstComments = lstComments;
    }


    public Integer getIdea_key() {
        return idea_key;
    }

    public void setIdea_key(Integer idea_key) {
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
