package Entity.Users;

import Entity.Post.ParagraphPost;
import Entity.Post.SharingCentre;

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
    private final String userID;
    private final String userName;
    //The password of the User.
    private String password;
    //All friends of the User.
    private final ArrayList<User> friends;
    //All posts of the User.
    private final ArrayList<ParagraphPost> myPosts;

    private final ArrayList<User> blockedUser;

    private ArrayList<String> addFriendRequests;

    //The sharing centre of the User.
    private final SharingCentre sharingCentre;
    //The log in status of the User.
    private boolean loggedIn;

    /**
     * Creates a user
     *
     * @param username the username of the user.
     * @param password the password of the user.
     *
     */
    public User(String username, String password){
        this.userID = String.valueOf(iD);
        this.userName = username;
        this.password = password;
        this.friends = new ArrayList<>();
        this.myPosts = new ArrayList<>();
        this.blockedUser = new ArrayList<>();
        /* this.addFriendRequests = new ArrayList<>();
         */
        this.loggedIn = false;
//        this.PtoPMessageHistory = new HashMap<>();
        this.sharingCentre = new SharingCentre();
        iD = iD + 1;
    }



    public User(){
        this.iD = -1;
        this.userID = "-1";
        this.userName = "Guest user";
        this.password = "";
        this.friends = new ArrayList<>();
        this.myPosts = new ArrayList<>();
        this.blockedUser = new ArrayList<>();
        this.loggedIn = false;
        this.sharingCentre = new SharingCentre();
    }
    // a getter for user id
    public String getID (){
        return userID;
    }
    // a getter for user name
    public String getUserName() {
        return this.userName;
    }
    // a getter for user password
    public String getPassword() {
        return this.password;
    }
    // a getter for user friends
    public ArrayList<User> getFriends() {
        return this.friends;
    }
    // a getter for user posts
    public ArrayList<ParagraphPost> getMyPosts() {
        return this.myPosts;
    }

    // a getter for user blockedUser
    public ArrayList<User> getBlockedUser() {
        return this.blockedUser;
    }

    /* public ArrayList<String> getAddFriendRequests() {
        return this.addFriendRequests;
    */
    // a getter for user login status
    public boolean getLoggedIn() {
        return this.loggedIn;
    }
    // a getter for user SharingCentre
    public SharingCentre getSharingCentre() {
        return sharingCentre;
    }
    // a setter for user login status
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

     */
    public void changePassword (String password){
        //Change the password to new password
        this.password = password;
    }

    // a setter for friend
    public void addFriend (User friend){
        //Add friend to the list friends
        this.friends.add(friend);
    }
    // a setter for friends
    public void addFriends (ArrayList<User> friend){
        //Add friends to the list friends
        this.friends.addAll(friend);
    }
    // a setter for blocked user
    public void addBlockedUser (User blocked){
        //Add user to blocked list
        this.blockedUser.add(blocked);
    }
    // a setter for password
    public void setPassword (String password){
        //Set password for user.
        this.password = password;
    }

    // a setter for removing friend
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

    // a setter for FriendRequests
    public ArrayList<String> getAddFriendRequests() {
        return addFriendRequests;
    }
}