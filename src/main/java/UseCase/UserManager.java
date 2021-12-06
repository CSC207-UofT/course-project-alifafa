package UseCase;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import DataAccessInterface.DataAccess;
import Entity.ParagraphPost;
import Entity.User;
import Gateway.DataAccessGateway;
import InputBoundary.UserInputBoundary;
import Entity.UserList;
import OutputBoundary.*;

public class UserManager implements UserInputBoundary {

    /**
     * A manager that manage User, including create user, login, read and write data, add friend.
     */
    private final DataAccess gateway = new DataAccessGateway();

    public DataAccess getGateway(){
        return gateway;
    }

    @SuppressWarnings("unchecked")
    public <T> void readData() throws IOException, ClassNotFoundException {
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
            HashMap<String, T> saved = this.gateway.readFromFile("User_State.csv");
            ArrayList<User> storage = (ArrayList<User>) saved.get("storage");
            for (User u: storage) {
                String name = u.getUserName();
                ArrayList<User> f = (ArrayList<User>) saved.get(name + "f");
                u.addFriends(f);
                ArrayList<User> b = (ArrayList<User>) saved.get(name + "b");
                u.getBlockedUser().addAll(b);
                ArrayList<ParagraphPost> p = (ArrayList<ParagraphPost>) saved.get(name + "p");
                u.getMyPosts().addAll(p);

                /*
                for (ParagraphPost post: p)
                    List<String[]> c = (List<String[]>) saved.get(name + "p_comments");
                    post.getComments().addAll((List<String[]>) saved.get(name + "p_comments"));
                    post.getUsersWhoLiked().addAll((List<User>) saved.get(name + "p_usersWhoLiked"));
                }
                List<String[]> co = u.getMyPosts().get(0).getComments();

                 */
            }
            store.addUsers(storage);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> void writeData (DataAccess dataAccess) throws IOException {
        //Write data to file
        UserList store = new UserList();
        ArrayList<User> lst = store.getAllUsers();
        HashMap<String, T> save = new HashMap<String, T>();
        save.put("storage", (T) lst);
        for (User u: lst) {
            save.put(u.getUserName() + "f", (T) u.getFriends());
            save.put(u.getUserName() + "p", (T) u.getMyPosts());
            save.put(u.getUserName() + "b", (T) u.getBlockedUser());
            ArrayList<ParagraphPost> posts = u.getMyPosts();
            for (ParagraphPost post: posts){
                save.put(u.getUserName() + "p_comments", (T) post.getComments());
                save.put(u.getUserName() + "p_usersWhoLiked", (T) post.getUsersWhoLiked());
            }
        }
        //List<String[]> comments = (List<String[]>) save.get(lst.get(0).getUserName() + "p_comments");

        dataAccess.saveToFile("User_State.csv", save);
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


    public boolean checkUserName (String userName) {
        //Check whether the username existed in StoreUser or not
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        System.out.println(stored.size());
        for (User user : stored) {
            if (user.getUserName().equals(userName)) {
                return false;
            }
        }
        return true;
    }

    public void createUser (String userName, String password) throws IOException {
        //Create a user
        UserList store = new UserList();
        User user = new User(userName, password);
        store.addUser(user);
        this.writeData(this.gateway);
    }


    public boolean checkFriend (String username, String friendUsername){
        //Find friend for a given user with given friend's userName.
        User user = this.getUser(username);
        List<User> friends = user.getFriends();
        for (User i: friends){
            if (i.getUserName().equals(friendUsername)){
                return true;
            }
        }
        return false;
    }

    public String findPassword (String userName){
        //Return a password with given ID after searching in StoreUser.
        //Return null if such user does not exist.
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getUserName().equals(userName)) {
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

    public User getUser (String username){
        //Return user with given ID
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getUserName().equals(username)) {
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


    public void addFriend (String userName, String friendUserName) throws IOException {
        //Add friend to the list friends
        User user = this.getUser(userName);
        user.addFriend(this.getUser(friendUserName));
        User friend = this.getUser(friendUserName);
        friend.addFriend(this.getUser(userName));

        // update the sharing centre of both users
        user.getSharingCentre().getAllPosts().addAll(friend.getMyPosts());
        friend.getSharingCentre().getAllPosts().addAll(user.getMyPosts());

        this.writeData(this.gateway);

    }

    public void editPassword(String new_password, String userName){
        //Edit password or username
        User user = this.getUser(userName);
        user.setPassword(new_password);
      
    }

    public void addBlockedUser (String id, String friendID){
        //Add user to blocked list
        User user = this.getUser(id);
        User friend = this.getUser(friendID);
        user.addBlockedUser(friend);
    }

    public void removeFriend (String userName, String friendUserName){
        //remove friend to the list friends
        User user = this.getUser(userName);
        user.removeFriend(this.getUser(friendUserName));
        User friend = this.getUser(friendUserName);
        friend.removeFriend(this.getUser(userName));

        // remove the posts from each other's sharing centre
        user.getSharingCentre().getAllPosts().removeAll(friend.getMyPosts());
        friend.getSharingCentre().getAllPosts().removeAll(user.getMyPosts());

    }

    public ArrayList<String> getAddFriendRequests(User user) {
        //Return user’s request list.
        return user.getAddFriendRequests();
    }


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
    public void runAccountRegistration(String[] parameters, AccountRegistrationOutputBoundary outputBoundary) throws IOException {
        if (this.checkUserName(parameters[0])){
            this.createUser(parameters[0], parameters[1]);
            outputBoundary.setRegistrationStatus(true);
        } else{
            outputBoundary.setRegistrationStatus(false);
        }
    }

    @Override
    public void runAddFriend(String[] userInput, AddFriendOutputBoundary outputBoundary) throws IOException{
        if(userInput[0].equals(userInput[1])){
            outputBoundary.setStatus("add themselves");
        } else if (this.checkFriend(userInput[0], userInput[1])) {
            outputBoundary.setStatus("existing friend");
        } else {
            addFriend(userInput[0], userInput[1]);
            outputBoundary.setAddFriendName(userInput[1]);
        }
    }

    @Override
    public void runAddBlocked(String[] userInput, BlockedListOutputBoundary outputBoundary){
        addBlockedUser(userInput[0], userInput[1]);
        outputBoundary.setAddBlockedStatus(userInput[1]);
    }

    public void runCheckFriend(String me, String friend, CheckFriendOutputBoundary outputBoundary) {
        outputBoundary.setCheckFriendStatus(checkFriend(me, friend));

    }

    public void runEditPassword(String[] parameters, EditPasswordOutputBoundary outputBoundary){
        editPassword(parameters[0], parameters[1]);
        outputBoundary.setEdited(true);
    }

    @Override
    public void runLogOut(String username) {
        this.getUser(username).changeLoggedInStatus();
    }

    @Override
    public void findLoggedInUser(LogOutOutputBoundary logOutOutputBoundary) {
        UserList store = new UserList();
        ArrayList<User> stored = store.getAllUsers();
        for (User user: stored) {
            if (user.getLoggedIn()) {
                String name = user.getUserName();
                user.changeLoggedInStatus();
            }
        }
    }

    @Override
    public void runRemoveFriend(String[] parameters, RemoveFriendOutputBoundary outputBoundary) {
        this.removeFriend(parameters[0], parameters[1]);
        outputBoundary.setRemoveFriendName(parameters[1]);
    }

}