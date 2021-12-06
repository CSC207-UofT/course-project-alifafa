package UIs;

import Controllers.UserControllers.AddFriendController;
import Controllers.UserControllers.BlockedListController;
import Presenters.AddFriendPresenter;
import Presenters.BlockedListPresenter;

import java.util.Scanner;

public class BlockedListUI extends ParentUI{
    /**
     * A user interface for adding blocked users, will receive feedback from BlockedListPresenter.
     */

    /*
     * This method is responsible for adding a friend task.
     */
    public void run () {
        BlockedListController controller = new BlockedListController();
        BlockedListPresenter presenter = new BlockedListPresenter();

        String[] param = new String[2];

        System.out.println("Your ID ");
        Scanner scanner = new Scanner(System.in);
        param[0] = scanner.nextLine();
        System.out.println("Your friend's ID: ");
        param[1] = scanner.nextLine();

        controller.addBlocked(param, presenter);
        System.out.println(presenter.presentOutput());
    }
}
