package UIs;

import Controllers.UserControllers.AddFriendController;
import Presenters.AddFriendPresenter;


import java.util.Scanner;

public class AddFriendUI {
    /**
     * A user interface for adding friend, will receive feedback from AddFriendPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run (AddFriendController controller, AddFriendPresenter presenter) {
        String[] parameters = new String[2];

        System.out.println("Your ID ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("Your friend's ID: ");
        parameters[1] = scanner.nextLine();

        controller.addFriend(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}
