package InputOutputBoundary;

import Entity.StoreUser;
import Entity.User;

import java.util.ArrayList;

public interface UserInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager but it can use InputBoundary instead.
     */
    public boolean checkID (String id);
        //Check whether the id existed in StoreUser or not


    public boolean checkUserName (String userName);
        //Check whether the username existed in StoreUser or not


    public User createUser (String id, String userName, String password);



    public User findFriend (String id, String friendID);

    public String findPassword (String id);

    public void changeLogInStatus(String id);

    public User getUser (String id);

    public void changeUserName (User user, String userName);

    public void changePassword (User user, String password);

    public void addFriend (String id, String friendID);

    public void removeFriend (User user, User friend);

    public ArrayList<String> getAddFriendRequests(User user);

}
