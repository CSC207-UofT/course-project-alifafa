package main;

import java.util.ArrayList;

public class StoreUser {
    private ArrayList<User> allUsers;

    public StoreUser(){
        this.allUsers = new ArrayList<User>();
    }

    public void addUser (User user){
        this.allUsers.add(user);
    }
    public ArrayList<User> getAllUsers(){
        return this.allUsers;
    }

}
