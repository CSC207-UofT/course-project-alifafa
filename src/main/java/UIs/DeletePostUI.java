package UIs;

import CommandControl.Constants;
import Controllers.PostsSharingController.DeletePostController;
import Presenters.DeletePostPresenter;

import java.io.IOException;
import java.util.Scanner;

public class DeletePostUI extends ParentUI {
    /**
     * User interface to delete post.
     */

    DeletePostController controller = new DeletePostController();
    DeletePostPresenter presenter = new DeletePostPresenter();

    @Override
    public void run() throws IOException {
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();
        String[] params = new String[2];

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            Scanner scanner = new Scanner(System.in);
            System.out.println("The post id: (Integer)");
            params[1] = scanner.nextLine();

            controller.runDeletePost(params[0], params[1], presenter);
            System.out.println(presenter.presentOutput());
//            try {
//                controller.runDeletePost(params[0], params[1], presenter);
//                System.out.println(presenter.presentOutput());
//            } catch (Exception e) {
//                System.out.println("ConcurrentModificationException");
//            }


        }
    }
}