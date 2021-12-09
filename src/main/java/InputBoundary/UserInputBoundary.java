package InputBoundary;

import Entity.Users.User;
import OutputBoundary.User.Add_Remove_Block_User.AddFriendOutputBoundary;
import OutputBoundary.User.Add_Remove_Block_User.BlockedListOutputBoundary;
import OutputBoundary.User.Add_Remove_Block_User.CheckFriendOutputBoundary;
import OutputBoundary.User.Add_Remove_Block_User.RemoveFriendOutputBoundary;
import OutputBoundary.User.Create_Edit_Account.AccountRegistrationOutputBoundary;
import OutputBoundary.User.Create_Edit_Account.EditPasswordOutputBoundary;
import OutputBoundary.User.LogIn_LogOut.LogInOutputBoundary;
import OutputBoundary.User.LogIn_LogOut.LogOutOutputBoundary;

import java.io.IOException;


public interface UserInputBoundary {
    // This InputBoundary interface must be implemented by the UserManager.
    // Controller knows nothing about the UserManager, but it can use InputBoundary instead.


    /**
     * @param parameters     the inputs of runLogIn
     * @param outputBoundary the outputBoundary of UserManager
     */
    void runLogIn(String[] parameters, LogInOutputBoundary outputBoundary);

    /**
     * @param parameters     the inputs of runAccountRegistration
     * @param outputBoundary the outputBoundary of UserManager
     * @throws IOException exception
     */
    void runAccountRegistration(String[] parameters, AccountRegistrationOutputBoundary outputBoundary) throws IOException;

    /**
     * @param parameters     the inputs of runAddFriend
     * @param outputBoundary the outputBoundary of UserManager
     * @throws IOException exception
     */
    void runAddFriend(String[] parameters, AddFriendOutputBoundary outputBoundary) throws IOException;

    /**
     * @param id user ID
     * @return return a user
     */
    User getUser(String id);

    /**
     * @param me             the user
     * @param friend         user's friend
     * @param outputBoundary the outputBoundary of UserManager
     */
    void runCheckFriend(String me, String friend, CheckFriendOutputBoundary outputBoundary);

    /**
     * @param username the user's UserName
     */
    void runLogOut(String username);

    void findLoggedInUser(LogOutOutputBoundary logOutOutputBoundary);

    /**
     * @param parameters     the inputs of runRemoveFriend
     * @param outputBoundary the outputBoundary of UserManager
     */
    void runRemoveFriend(String[] parameters, RemoveFriendOutputBoundary outputBoundary);

    /**
     * @param parameters     the inputs of runAddBlocked
     * @param outputBoundary the outputBoundary of UserManager
     * @throws IOException exception
     */
    void runAddBlocked(String[] parameters, BlockedListOutputBoundary outputBoundary) throws IOException;

    /**
     * @param parameters the inputs of runCheckBlocked
     * @return if is blocked
     */
    boolean runCheckBlocked(String[] parameters);

    /**
     * @param parameters     the inputs of runEditPassword
     * @param outputBoundary the outputBoundary of UserManager
     */
    void runEditPassword(String[] parameters, EditPasswordOutputBoundary outputBoundary);
}
