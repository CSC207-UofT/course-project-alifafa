package UseCase;


import DataAccessInterface.DataAccess;
import Entity.User;
import Entity.UserList;
import InputBoundary.UserInputBoundary;
import OutputBoundary.AccountRegistrationOutputBoundary;
import OutputBoundary.AddFriendOutputBoundary;
import OutputBoundary.LogInOutputBoundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class UserManager implements UserInputBoundary {

    /**
     * A manager that manage User, including create user, login, read and write data, add friend.
     */

    public void readData(DataAccess dataAccess) throws IOException, ClassNotFoundException {
        //Read data from file and cast it to right class.
        boolean readable = false;
        try (BufferedReader br = new BufferedReader(new FileReader("User_State.csv"))) {
            String line = br.readLine();
            if (line != null) {
                readable = true;
            }
        }
        if (readable) {
            UserList store = new UserList();
            ArrayList<User> lst = dataAccess.readFromFile("User_State.csv");
            store.addUsers(lst);
        }
    }

    public void writeData (DataAccess dataAccess) throws IOException {
        //Write data to file
        UserList store = new UserList();
        dataAccess.saveToFile("User_State.csv", store.getAllUsers());
    }

    public boolean checkID (String id){
        //Check whether the id existed in StoreUser or not
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID().equals(id)) {
                return false;
            }
        }
        return true;
    }

    /* will be implemented in later phase.
    public boolean checkUserName (String userName) {
        //Check whether the username existed in StoreUser or not
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user : stored) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }
    */

    public void createUser (String id, String userName, String password){
        //Create a user
        UserList store = new UserList();
        User user = new User(id, userName, password);
        store.addUser(user);
    }

    /* will be implemented in later phase.
    public User findFriend (String id, String friendID){
        //Find friend for a given user with given friend's userName.
        User user = this.getUser(id);
        ArrayList<User> friends = user.getFriends();
        for (User i: friends){
            if (i.getID().equals(friendID)){
                return i;
            }
        }
        return null;
    }
     */

    public String findPassword (String id){
        //Return a password with given ID after searching in StoreUser.
        //Return null if such user does not exist.
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID().equals(id)) {
                return user.getPassword();
            }
        }
        return null;
    }

    public void changeLogInStatus(String id){
        //Change LogIn status of the user with given id.
        User user = this.getUser(id);
        user.changeLoggedInStatus();
    }

    public User getUser (String id){
        //Return user with given ID
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getID().equals(id)) {
                return user;
            }
        }
        return null;
    }

    /* will be implemented in later phase.
    public void changeUserName (User user, String userName){
        //Change the userName to new userName
        user.changeUserName(userName);
    }

    public void changePassword (User user, String password){
        //Change the userName to new password
        user.changePassword(password);
    }
     */

    public void addFriend (String id, String friendID){
        //Add friend to the list friends
        User user = this.getUser(id);
        user.addFriend(this.getUser(friendID));
        User friend = this.getUser(friendID);
        friend.addFriend(this.getUser(id));

    }

    /* will be implemented in later phase.
    public void removeFriend (User user, User friend) {
        //Remove friend from the list friends
        user.removeFriend(friend);
    }

    public ArrayList<String> getAddFriendRequests(User user) {
        //Return user’s request list.
        return user.getAddFriendRequests();
    }
     */

    @Override
    public void runLogIn(String[] parameters, LogInOutputBoundary outputBoundary) {
        String password = this.findPassword(parameters[0]);
        if (password != null) {
            if (password.equals(parameters[1])) {
                this.changeLogInStatus(parameters[0]);
                outputBoundary.setLogInStatus(true);
            } else {
                outputBoundary.setLogInStatus(false);
            }
        } else {
            outputBoundary.setLogInStatus(false);
        }

    }

    @Override
    public void runAccountRegistration(String[] parameters, AccountRegistrationOutputBoundary outputBoundary) {
        if (this.checkID(parameters[0])){
            this.createUser(parameters[0], parameters[1], parameters[2]);
            outputBoundary.setRegistrationStatus(true);
        } else{
            outputBoundary.setRegistrationStatus(false);
        }
    }

    @Override
    public void runAddFriend(String[] userInput, AddFriendOutputBoundary outputBoundary) {
        addFriend(userInput[0], userInput[1]);
        outputBoundary.setAddFriendStatus(userInput[1]);
    }
}
