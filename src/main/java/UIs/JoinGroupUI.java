package UIs;


import CommandControl.Constants;
import Controllers.UserControllers.JoinGroupController;
import Presenters.JoinGroupPresenter;

import java.io.IOException;
import java.util.Scanner;


public class JoinGroupUI extends ParentUI {
    /**
     * A group interface for joining a group, will receive feedback from JoinGroupPresenter.
     */

    /*
     * This method is responsible for users to join a group.
     */
    public void run () throws IOException {
        Constants constants = new Constants();
        String currentUser = constants.getCurrentUser();

        JoinGroupController controller = new JoinGroupController();
        JoinGroupPresenter presenter = new JoinGroupPresenter();

        String[] parameters = new String[2];


        parameters[0] = currentUser;
        System.out.println("The current logged in user is " + parameters[0]);

        System.out.println("GroupName: ");
        Scanner scanner = new Scanner(System.in);
        parameters[1] = scanner.nextLine();

        controller.joinGroup(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}