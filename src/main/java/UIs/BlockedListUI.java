package UIs;

import CommandControl.Constants;
import Controllers.UserControllers.AddFriendController;
import Controllers.UserControllers.BlockedListController;
import Presenters.AddFriendPresenter;
import Presenters.BlockedListPresenter;

import java.io.IOException;
import java.util.Scanner;

public class BlockedListUI extends ParentUI{
    /**
     * A user interface for adding blocked users, will receive feedback from BlockedListPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run () throws IOException {

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else{
            BlockedListController controller = new BlockedListController();
            BlockedListPresenter presenter = new BlockedListPresenter();

            addBlocked(currentUser, controller, presenter);
        }

    }

    public void addBlocked (String currentUser, BlockedListController controller, BlockedListPresenter presenter) throws IOException {
        String[] parameters = new String[2];

        parameters[0] = currentUser;
        System.out.println("The current logged in user is " + parameters[0]);

        System.out.println("Enter the username of user you want to blocked: ");
        Scanner scanner = new Scanner(System.in);
        parameters[1] = scanner.nextLine();

        controller.addBlocked(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}
