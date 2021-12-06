package UIs;

import Controllers.ChatControllers.PtoGMessageController;
import Entity.Group;
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
        PtoGMessageController controller = new PtoGMessageController();
        PtoGMessageHistoryPresenter presenter = new PtoGMessageHistoryPresenter();
        String[] parameters = new String[3];

        System.out.println("My UserID: ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("GroupID: ");
        parameters[1] = scanner.nextLine();

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
        presenter.present();
    }
}