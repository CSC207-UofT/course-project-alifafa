package main;

import java.util.ArrayList;

public class StoreUser {
    private static ArrayList<User> allUsers;

    public StoreUser(){
        allUsers = new ArrayList<>();
    }

    public void addUser (User user){
        allUsers.add(user);
    }
    public ArrayList<User> getAllUsers(){
        return allUsers;
    }

}
