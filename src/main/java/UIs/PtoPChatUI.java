package UIs;

import Controllers.ChatControllers.PtoPMessageControllerFacade;
import Presenters.PtoPMessageHistoryPresenter;

import java.io.IOException;
import java.util.Scanner;

public class PtoPChatUI extends ParentUI{

    /**
     * an user interface for sending and receiving ptop message.
     */

    // Use this method to realize person to person chat function.
    public void run () throws IOException {

        PtoPMessageControllerFacade controller = new PtoPMessageControllerFacade();
        PtoPMessageHistoryPresenter presenter = new PtoPMessageHistoryPresenter();

        CheckFriendController checkFriendController = new CheckFriendController();
        CheckFriendPresenter checkFriendPresenter = new CheckFriendPresenter();

        FindLoggedInUserPresenter findLoggedInUserPresenter = new FindLoggedInUserPresenter();
        FindLoggedInUserController findLoggedInUserController = new FindLoggedInUserController();

        findLoggedInUserController.findLoggedInUser(findLoggedInUserPresenter);
        String userName = findLoggedInUserPresenter.presentOutput();


        String[] parameters = new String[2];

        System.out.println("Friend's UserName: ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();

        checkFriendController.runCheckFriend(userName, parameters[0], checkFriendPresenter);
        boolean isFriend = checkFriendPresenter.isFriend();

        if (isFriend){
        //print previous chat history between my friend and me.
        System.out.println("Previous chat history: ");
        controller.receiveMessageHistory(userName, parameters[0], presenter);
        presenter.present();

        //send message to the friend
        System.out.println("Please type your message.");
        parameters[1] = scanner.nextLine();
        controller.sendMessage(userName, parameters[0], parameters[1]);

        //print latest chat history between my friend and me.
        System.out.println("Current chat history: ");
        controller.receiveMessageHistory(userName, parameters[0], presenter);
        presenter.present();}else{
            System.out.println("Not valid friend");
        }

    }
}
