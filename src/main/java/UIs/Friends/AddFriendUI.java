package UIs.Friends;

import CommandControl.Constants;
import Controllers.UserControllers.RemoveAndAddFriend.AddFriendController;
import Controllers.UserControllers.RemoveAndAddFriend.BlockedListController;
import Presenters.AddFriendPresenter;
import UIs.ParentUI;


import java.io.IOException;
import java.util.Scanner;

public class AddFriendUI extends ParentUI {
    /**
     * A user interface for adding friend, will receive feedback from AddFriendPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */

    public void run () throws IOException {

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else{
            AddFriendController controller = new AddFriendController();
            AddFriendPresenter presenter = new AddFriendPresenter();

            addFriend(currentUser, controller, presenter);
        }



    }

    static void addFriend(String currentUser, AddFriendController controller, AddFriendPresenter presenter) throws IOException {
        String[] parameters = new String[2];

        parameters[0] = currentUser;
        System.out.println("The current logged in user is " + parameters[0]);

        System.out.println("Your friend's userName: ");
        Scanner scanner = new Scanner(System.in);
        parameters[1] = scanner.nextLine();

        BlockedListController b = new BlockedListController();
        if(!b.checkBlocked(parameters)) {
        controller.addFriend(parameters, presenter);
        System.out.println(presenter.presentOutput());}
        else{
            System.out.println("You cannot add this user because you are in the blocked list");
            }
    }
}
