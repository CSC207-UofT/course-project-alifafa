package InputBoundary;

import Entity.User;
import OutputBoundary.AccountRegistrationOutputBoundary;
import OutputBoundary.AddFriendOutputBoundary;
import OutputBoundary.LogInOutputBoundary;


public interface UserInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager, but it can use InputBoundary instead.
     */

    void runLogIn (String[] parameters, LogInOutputBoundary outputBoundary);

    void runAccountRegistration (String[] parameters, AccountRegistrationOutputBoundary outputBoundary);

    void runAddFriend(String[] parameters, AddFriendOutputBoundary outputBoundary);

    User getUser (String id);
}
