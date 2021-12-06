package UIs;

import CommandControl.Constants;
import Controllers.UserControllers.AddFriendController;
import Presenters.AddFriendPresenter;


import java.util.Scanner;

public class AddFriendUI extends ParentUI {
    /**
     * A user interface for adding friend, will receive feedback from AddFriendPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run () {
        AddFriendController controller = new AddFriendController();
        AddFriendPresenter presenter = new AddFriendPresenter();
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else{
            String[] parameters = new String[2];

            parameters[0] = currentUser;
            System.out.println("The current logged in user is " + parameters[0]);

            System.out.println("Your friend's userName: ");
            Scanner scanner = new Scanner(System.in);
            parameters[1] = scanner.nextLine();

            controller.addFriend(parameters, presenter);
            System.out.println(presenter.presentOutput());
        }



    }
}
