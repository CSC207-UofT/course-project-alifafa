package Controllers.UserControllers;

import UseCases.UseCase;
import UseCase.UserManager;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * This class is responsible for managing the user input and calling associated UserManager when the user
 * wants to message a friend.
 */
public class MessageFriendController extends UserController {

    public MessageFriendController() {
        super(new UserManager());
        this.userPrompt.add("Your ID");
        this.userPrompt.add("Friend's ID");
    }

    /**
     * @param parameters The input from the user, which is an array that contains userID and input password.
     * @return return a boolean indicating whether the user has the friend.
     */
    public boolean checkFriend(String[] parameters) {
        UserManager manager = (UserManager) this.useCase;

        return (manager.findFriend(parameters[1], parameters[0]) != null);
    }
}