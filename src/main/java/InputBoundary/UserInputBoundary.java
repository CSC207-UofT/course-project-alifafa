package InputBoundary;

import Entity.User;
import OutputBoundary.*;

import java.io.IOException;


public interface UserInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager, but it can use InputBoundary instead.
     */

    void runLogIn (String[] parameters, LogInOutputBoundary outputBoundary);

    void runAccountRegistration (String[] parameters, AccountRegistrationOutputBoundary outputBoundary) throws IOException;

    void runAddFriend(String[] parameters, AddFriendOutputBoundary outputBoundary);

    User getUser (String id);

    void runCheckFriend(String me, String friend, CheckFriendOutputBoundary outputBoundary);

    void runLogOut(String username);

    void findLoggedInUser(LogOutOutputBoundary logOutOutputBoundary);

    void runAddBlocked(String[] parameters, BlockedListOutputBoundary outputBoundary);

    void runEditPassword(String[] parameters, EditPasswordOutputBoundary outputBoundary);
}
