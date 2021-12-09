package UIs.Friends;

import CommandControl.Constants;
import Controllers.UserControllers.RemoveAndAddFriend.RemoveFriendController;
import Presenters.User.RemoveFriendPresenter;
import UIs.ParentUI;

import java.util.Scanner;

public class RemoveFriendUI extends ParentUI {
    static void removeFriend(String currentUser, RemoveFriendController controller, RemoveFriendPresenter presenter) {
        String[] parameters = new String[2];

        parameters[0] = currentUser;
        System.out.println("The current logged in user is " + parameters[0]);

        System.out.println("Enter the username of the friend you want to remove");
        Scanner scanner = new Scanner(System.in);
        parameters[1] = scanner.nextLine();

        controller.removeFriend(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }

    /**
     * A user interface for adding friend, will receive feedback from AddFriendPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run() {

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            RemoveFriendController controller = new RemoveFriendController();
            RemoveFriendPresenter presenter = new RemoveFriendPresenter();

            removeFriend(currentUser, controller, presenter);
        }


    }
}
