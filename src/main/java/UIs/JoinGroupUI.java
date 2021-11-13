package UIs;


import Controllers.UserControllers.JoinGroupController;
import Presenters.JoinGroupPresenter;


import java.util.Scanner;

public class JoinGroupUI extends ParentUI {
    /**
     * A user interface for adding friend, will receive feedback from AddFriendPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run () {
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