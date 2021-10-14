package main;

public class UserManager{

    public User createUser(int id, String username, String password){
        User user = new User(id, username, password);
        StoreUser store = new StoreUser();
        store.addUser(user);
        return user;
    }

    public String logIn (String userID){
        return null;
        // TODO: replace the above line. This method need to return the password of that user.
        // Return null if no such user exists.
    }

    public void changeLogInStatus(String userID){
        //TODO: change the login status of user given its userID.
    }

}

