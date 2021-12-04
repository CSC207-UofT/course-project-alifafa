package com.example.myapplication.Entity;

import java.io.Serializable;
import java.util.ArrayList;



public class User implements Serializable {
    /**
     * A User's information.
     */

    // === Instance Variables ===
    //The ID of User.
    private static int iD = 0;
    //The username of the User.
    private final String userName;
    //The password of the User.
    private final String password;
    //All friends of the User.
    private final ArrayList<User> friends;
    //All posts of the User.
    private final ArrayList<ParagraphPost> myPosts;
    /* private final ArrayList<User> blockedUser;private final ArrayList<String> addFriendRequests;
     */
    //The sharing centre of the User.
    private final SharingCentre sharingCentre;
    //The log in status of the User.
    private boolean loggedIn;

    /**
     * Creates a user.
     * iD is the ID of the user.
     * @param username the username of the user.
     * @param password the password of the user.
     *
     */
    public User(String username, String password){
        iD = iD + 1;
        this.userName = username;
        this.password = password;
        this.friends = new ArrayList<>();
        this.myPosts = new ArrayList<>();
        /*this.blockedUser = new ArrayList<>();this.addFriendRequests = new ArrayList<>();
         */
        this.loggedIn = false;
//        this.PtoPMessageHistory = new HashMap<>();
        this.sharingCentre = new SharingCentre();
    }

    public int getID (){
        return iD;
    }

    public String getUserName() {
        return this.userName;
    }

    public String getPassword() {
        return this.password;
    }

    public ArrayList<User> getFriends() {
        return this.friends;
    }

    public ArrayList<ParagraphPost> getMyPosts() {
        return this.myPosts;
    }

    /* will be implemented in later phase.
    public ArrayList<User> getBlockedUser() {
        return this.blockedUser;
    }
    public ArrayList<String> getAddFriendRequests() {
        return this.addFriendRequests;
    }
    */

    public boolean getLoggedIn() {
        return this.loggedIn;
    }

    public SharingCentre getSharingCentre() {
        return sharingCentre;
    }

    public void changeLoggedInStatus() {
        //Change LogIn status of the user with given id.
        boolean status = this.loggedIn;
        this.loggedIn = !status;
    }

    /* will be implemented in later phase.
    public void changeUserName (String userName){
        //Change the userName to new userName
        this.userName = userName;
    }
    public void changePassword (String password){
        //Change the password to new password
        this.password = password;
    }
     */

    public void addFriend (User friend){
        //Add friend to the list friends
        this.friends.add(friend);
    }

    /* will be implemented in later phase.
    public void removeFriend (User friend){
        //Remove friend from the list friends
        int k = this.friends.size() + 1;
        for (int i = 0; this.friends.size() > i; i++){
            if (this.friends.get(i).equals(friend)){
                k = i;
            }
        }
        if (k < this.friends.size()) {
            this.friends.remove(k);
        }
    }
     */

}
