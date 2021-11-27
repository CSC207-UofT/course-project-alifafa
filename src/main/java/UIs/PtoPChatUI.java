package UIs;

import Controllers.ChatControllers.PtoPMessageController;
import DataAccessInterface.PtoPMessageDataAccessInterface;
import Gateway.PtoPMessageDataAccess;
import Presenters.PtoPMessageHistoryPresenter;

import java.io.IOException;
import java.util.Scanner;

public class PtoPChatUI extends ParentUI{

    /**
     * an user interface for sending and receiving ptop message.
     */

    // Use this method to realize person to person chat function.
    public void run () throws IOException {
        PtoPMessageController controller = new PtoPMessageController();
        PtoPMessageHistoryPresenter presenter = new PtoPMessageHistoryPresenter();
        String[] parameters = new String[3];

        System.out.println("My UserID: ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("Friend's UserID: ");
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
