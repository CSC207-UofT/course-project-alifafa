package InputBoundary;

import Entity.User;
import OutputBoundary.AccountRegistrationOutputBoundary;
import OutputBoundary.AddFriendOutputBoundary;
import OutputBoundary.LogInOutputBoundary;
import Presenters.AccountRegistrationPresenter;
import Presenters.AddFriendPresenter;
import Presenters.LogInPresenter;

import java.util.ArrayList;

public interface UserInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager but it can use InputBoundary instead.
     */

    public void runLogIn (String[] parameters, LogInOutputBoundary outputBoundary);

    public void runAccountRegistration (String[] parameters, AccountRegistrationOutputBoundary outputBoundary);

    public void runAddFriend(String[] parameters, AddFriendOutputBoundary outputBoundary);

    public User getUser (String id);
}
