package main;

import java.util.ArrayList;

/*
Responsibilities
It can Create User
Login
Find friend for a given user with given friend's userName.
Return a password with given ID after searching in StoreUser. Return null if such user does not exist.
Change LogIn status.
Return user with given ID
Change Username
Change Password
Add Friend, Remove Friend
Return user’s request list.
 */
public class UserManager{

    public boolean checkID (int id){
        //Check whether the id existed in StoreUser or not
        StoreUser store = new StoreUser();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID() == id) {
                return false;
            }
        }
        return true;
    }


    public boolean checkUserName (String userName) {
        //Check whether the username existed in StoreUser or not
        StoreUser store = new StoreUser();
        ArrayList<User> stored = store.getAllUsers();
        for (User user : stored) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public User createUser (int id, String userName, String password){
        //Create a user
        StoreUser store = new StoreUser();
        ArrayList<User> stored = store.getAllUsers();
        User user = new User(id, userName, password);
        store.addUser(user);
        return user;
    }



    public User findFriend (User user, String userName){
        //Find friend for a given user with given friend's userName.
        ArrayList<User> friends = user.getFriends();
        for (User i: friends){
            if (i.getUserName().equals(userName)){
                return i;
            }
        }
        return null;
    }

    public String findPassword (int id){
        //Return a password with given ID after searching in StoreUser.
        //Return null if such user does not exist.
        StoreUser store = new StoreUser();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID() == id) {
                return user.getPassword();
            }
        }
        return null;
    }

    public void changeLogInStatus(int id){
        //Change LogIn status of the user with given id.
        User user = this.getUser(id);
        user.changeLoggedInStatus();
    }

    public User getUser (int id){
        //Return user with given ID
        StoreUser store = new StoreUser();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID() == id) {
                return user;
            }
        }
        return null;
    }

    public void changeUserName (User user, String userName){
        //Change the userName to new userName
        user.changeUserName(userName);
    }

    public void changePassword (User user, String password){
        //Change the userName to new password
        user.changePassword(password);
    }

    public void addFriend (User user, User friend){
        //Add friend to the list friends
        user.addFriend(friend);
    }

    public void removeFriend (User user, User friend) {
        //Remove friend from the list friends
        user.removeFriend(friend);
    }

    public ArrayList<String> getAddFriendRequests(User user) {
        //Return user’s request list.
        return user.getAddFriendRequests();
    }
}

