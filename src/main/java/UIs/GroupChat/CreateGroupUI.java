package UIs.GroupChat;

import CommandControl.Constants;
import Controllers.GroupChatControllers.CreateGroupController;
import Presenters.Message.CreateGroupPresenter;
import UIs.ParentUI;


import java.io.IOException;
import java.util.Scanner;

public class CreateGroupUI extends ParentUI {
    /**
     * A user interface for creating a group, will receive feedback from CreateGroupPresenter.
     */



    public void run() throws IOException {
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else {
            CreateGroupController controller = new CreateGroupController();
            CreateGroupPresenter presenter = new CreateGroupPresenter();
            String[] parameters = new String[1];
            Scanner scanner = new Scanner(System.in);
            System.out.println("GroupName: ");
            parameters[0] = scanner.nextLine();

            controller.createAGroup(parameters, presenter);
            System.out.println(presenter.presentOutput());
        }
    }
}
