package com.example.myapplication.Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupList implements Serializable {
    private static final ArrayList<Group> allGroups = new ArrayList<>();
    public void addGroup (Group group){
        allGroups.add(group);
    }
    public void addGroups (ArrayList<Group> groups){
        allGroups.addAll(groups);
    }
    public ArrayList<Group> getAllGroups(){
        return allGroups;
    }

}
