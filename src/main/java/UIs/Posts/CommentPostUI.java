package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.PostCommentAndLike.CommentPostController;
import Presenters.Post.CommentPostPresenter;
import UIs.ParentUI;

import java.io.IOException;
import java.util.Scanner;

public class CommentPostUI extends ParentUI {
    /** User interface for the user to write comments to a post.
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
            System.out.println("The post id: ");
            params[1] = scanner.nextLine();

            System.out.println("Your comment: ");
            params[2] = scanner.nextLine();
            try {
                controller.runCommentPost(params[0], params[1], params[2], presenter);
                System.out.println(presenter.presentOutput());
            } catch (Exception e) {
                System.out.println("NumberFormatException");
            }

        }

    }
}