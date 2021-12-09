package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.PostCommentAndLike.DeletePostController;
import Presenters.Post.DeletePostPresenter;
import UIs.ParentUI;

import java.util.Scanner;

public class DeletePostUI extends ParentUI {
    /**
     * User interface to delete post.
     */

    final DeletePostController controller = new DeletePostController();
    final DeletePostPresenter presenter = new DeletePostPresenter();

    @Override
    public void run() {
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();
        String[] params = new String[2];

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            Scanner scanner = new Scanner(System.in);
            System.out.println("The post id: ");
            params[1] = scanner.nextLine();

            try {
                controller.runDeletePost(params[0], params[1], presenter);
                System.out.println(presenter.presentOutput());
            } catch (Exception e) {
                System.out.println("ConcurrentModificationException. Sorry... This feature is in maintenance.");
            }


        }
    }
}