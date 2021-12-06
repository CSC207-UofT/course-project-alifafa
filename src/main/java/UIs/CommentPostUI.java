package UIs;

import CommandControl.Constants;
import Controllers.PostsSharingController.CommentPostController;
import Presenters.CommentPostPresenter;

import java.io.IOException;
import java.util.Scanner;

public class CommentPostUI extends ParentUI {
    /**
     * @throws IOException
     */

    @Override
    public void run() throws IOException {
        CommentPostController controller = new CommentPostController();
        CommentPostPresenter presenter = new CommentPostPresenter();

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();
        String[] params = new String[3];

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            Scanner scanner = new Scanner(System.in);
            System.out.println("The post id: (Integer)");
            params[1] = scanner.nextLine();

            System.out.println("Your comment: ");
            params[2] = scanner.nextLine();

            controller.runCommentPost(params[0], params[1], params[3], presenter);
            System.out.println(presenter.presentOutput());
        }

    }
}