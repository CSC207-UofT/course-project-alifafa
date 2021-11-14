package UIs;

import Controllers.UserControllers.CreateGroupController;
import Presenters.CreateGroupPresenter;


import java.util.Scanner;

public class CreateGroupUI extends ParentUI{
    /**
     * A user interface for creating a group, will receive feedback from CreateGroupPresenter.
     */



    public void run() {
        CreateGroupController controller = new CreateGroupController();
        CreateGroupPresenter presenter = new CreateGroupPresenter();
        String[] parameters = new String[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("GroupID: ");
        parameters[0] = scanner.nextLine();
        System.out.println("GroupName: ");
        parameters[1] = scanner.nextLine();

        controller.createAGroup(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}
