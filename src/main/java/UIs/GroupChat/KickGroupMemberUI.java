package UIs.GroupChat;

import CommandControl.Constants;
import Controllers.GroupChatControllers.KickGroupMemberController;
import Presenters.Message.KickGroupMemberPresenter;
import UIs.ParentUI;

import java.util.Scanner;

public class KickGroupMemberUI extends ParentUI {
    static void kickGroupMember(String currentUser, KickGroupMemberController controller, KickGroupMemberPresenter presenter) {
        String[] parameters = new String[3];

        System.out.println("The current logged in user is " + currentUser);

        System.out.println("Enter the group name that you want to find");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();

        System.out.println("Enter the username that you want to kick");
        Scanner scanner2 = new Scanner(System.in);
        parameters[1] = scanner2.nextLine();

        controller.kickGroupMember(parameters, presenter);
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
            KickGroupMemberController controller = new KickGroupMemberController();
            KickGroupMemberPresenter presenter = new KickGroupMemberPresenter();

            kickGroupMember(currentUser, controller, presenter);
        }

    }
}
