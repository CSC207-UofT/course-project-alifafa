package UIs;


import CommandControl.Constants;
import Controllers.UserControllers.JoinGroupController;
import Presenters.JoinGroupPresenter;
import java.util.Scanner;


public class JoinGroupUI extends ParentUI {
    /**
     * A group interface for joining a group, will receive feedback from JoinGroupPresenter.
     */

    /*
     * This method is responsible for users to join a group.
     */
    public void run () {
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else {
            JoinGroupController controller = new JoinGroupController();
            JoinGroupPresenter presenter = new JoinGroupPresenter();

            String[] parameters = new String[2];

            System.out.println("Your ID ");
            Scanner scanner = new Scanner(System.in);
            parameters[0] = scanner.nextLine();
            System.out.println("GroupID: ");
            parameters[1] = scanner.nextLine();

            controller.joinGroup(parameters, presenter);
            System.out.println(presenter.presentOutput());
        }
    }
}