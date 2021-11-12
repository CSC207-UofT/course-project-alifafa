package Entity;

import java.io.Serializable;
import java.util.ArrayList;

public class UserList implements Serializable {
    private static ArrayList<User> allUsers = new ArrayList<>();
    public void addUser (User user){
        allUsers.add(user);
    }
    public ArrayList<User> getAllUsers(){
        return allUsers;
    }

}
