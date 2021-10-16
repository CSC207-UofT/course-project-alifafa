package Entity;

import java.util.ArrayList;

public class StoreUser {
    private static ArrayList<User> allUsers = new ArrayList<User>();
    public void addUser (User user){
        allUsers.add(user);
    }
    public ArrayList<User> getAllUsers(){
        return allUsers;
    }

}
