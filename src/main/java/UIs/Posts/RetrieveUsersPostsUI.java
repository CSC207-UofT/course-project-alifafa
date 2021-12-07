package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.UserAllPostController;
import Presenters.SharingCentrePresenter;
import UIs.ParentUI;

import java.io.IOException;
import java.util.Scanner;

public class RetrieveUsersPostsUI extends ParentUI {
    /**
     * User Interface to retrieve a user's posts
     *
     * @throws IOException
     */

    @Override
    public void run() throws IOException {
        UserAllPostController controller = new UserAllPostController();
        SharingCentrePresenter presenter = new SharingCentrePresenter();

        String[] params = new String[1];
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            System.out.println("The username of the User: ");
            Scanner scanner = new Scanner(System.in);
            params[0] = scanner.nextLine();

            controller.runRetrieveUserAllPost(params[0], presenter);
            System.out.println(presenter.presentOutput());
        }
    }
}
