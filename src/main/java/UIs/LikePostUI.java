package UIs;

import CommandControl.Constants;
import Controllers.PostsSharingController.LikePostController;

import java.io.IOException;
import java.util.Scanner;

public class LikePostUI extends ParentUI {
    /**
     * User interface for the user to like a post.
     *
     * @throws IOException
     */

    @Override
    public void run() throws IOException {
        LikePostController controller = new LikePostController();

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();
        String[] params = new String[2];

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;

            System.out.println("The post id: ");
            Scanner scanner = new Scanner(System.in);
            params[1] = scanner.nextLine();
            try {
                controller.runLikesPost(params[0], params[1]);
            } catch (Exception e) {
                System.out.println("NumberFormatException");
            }

        }
    }
}
