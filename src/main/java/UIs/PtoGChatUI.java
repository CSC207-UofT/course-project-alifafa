package UIs;

import CommandControl.Constants;
import Controllers.ChatControllers.PtoGMessageControllerFacade;
import Controllers.GroupChatControllers.CheckGroupController;
import Entity.Group;
import Presenters.CheckGroupPresenter;
import Presenters.PtoGMessageHistoryPresenter;
import UseCase.GroupManager;

import java.io.IOException;
import java.util.Scanner;

public class PtoGChatUI extends ParentUI{

    /**
     * a Group interface for sending and receiving PtoG message.
     */

    private final GroupManager groupManager = new GroupManager();
    public void run () throws IOException {
        Constants constants = new Constants();
        String currentUser = constants.getCurrentUser();
        if (currentUser==null){
            System.out.println("You need to log in first!");
        }

        else {
            PtoGMessageControllerFacade controller = new PtoGMessageControllerFacade();
            PtoGMessageHistoryPresenter presenter = new PtoGMessageHistoryPresenter();
            CheckGroupController checkGroupController = new CheckGroupController();
            CheckGroupPresenter checkGroupPresenter = new CheckGroupPresenter();

            String[] parameters = new String[3];

            parameters[0] = currentUser;
            System.out.println("The current logged in user is " + parameters[0]);

            System.out.println("Group Name: ");
            Scanner scanner = new Scanner(System.in);
            parameters[1] = scanner.nextLine();

            checkGroupController.checkGroup(parameters[0], parameters[1], checkGroupPresenter);
            boolean inGroup = checkGroupPresenter.inGroup();


            if (inGroup){
                //print the GroupName
                Group group = groupManager.getGroup(parameters[1]);
                String g = "Current Group:" + group.getGroupName();
                System.out.println(g);

                //print previous chat history from the group
                System.out.println("Previous group chat history: ");
                controller.GroupMessageHistory(parameters[0], parameters[1], presenter);
                presenter.present();

                //send message to the group
                System.out.println("Please type your message.");
                parameters[2] = scanner.nextLine();
                controller.sendGroupMessage(parameters[0], parameters[1], parameters[2]);

                //print latest chat history from this group.
                System.out.println("Current group chat history: ");
                controller.GroupMessageHistory(parameters[0], parameters[1], presenter);
                presenter.present();}
            else {
                System.out.println("You are not in this group, please join this group first");
            }}


    }
}