package UIs;

import Controllers.ChatControllers.PtoGMessageController;
import Controllers.ChatControllers.PtoPMessageController;
import Presenters.PtoGMessageHistoryPresenter;
import Presenters.PtoPMessageHistoryPresenter;

import java.io.IOException;
import java.util.Scanner;

public class PtoGChatUI extends ParentUI{

    /**
     * an user interface for sending and receiving ptop message.
     */

    // Use this method to realize person to person chat function.
    public void run () throws IOException {
        PtoGMessageController controller = new PtoGMessageController();
        PtoGMessageHistoryPresenter presenter = new PtoGMessageHistoryPresenter();
        String[] parameters = new String[3];

        System.out.println("My UserID: ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("GroupID: ");
        parameters[1] = scanner.nextLine();

        //print previous chat history between my friend and me.
        System.out.println("Previous chat history: ");
        controller.receiveMessageHistory(parameters[0], parameters[1], presenter);
        presenter.present();

        //send message to the friend
        System.out.println("Please type your message.");
        parameters[2] = scanner.nextLine();
        controller.sendMessage(parameters[0], parameters[1], parameters[2]);

        //print latest chat history between my friend and me.
        System.out.println("Current chat history: ");
        controller.receiveMessageHistory(parameters[0], parameters[1], presenter);
        presenter.present();
    }
}