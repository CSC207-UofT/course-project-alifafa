package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.PostCommentAndLike.PostAPostController;
import Presenters.Post.PostAPostPresenter;
import UIs.ParentUI;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PostAPostUI extends ParentUI {
    /**
     * User interface for the user to post a post
     */

    @Override
    public void run() throws IOException {
        PostAPostController controller = new PostAPostController();
        PostAPostPresenter presenter = new PostAPostPresenter();
        List<String> pictures = new ArrayList<>();

        String[] params = new String[3];
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            Scanner scanner = new Scanner(System.in);

            System.out.println("Content of the post: ");
            params[1] = scanner.nextLine();

            System.out.println("Location:");
            params[2] = scanner.nextLine();

            System.out.println("Want to add pictures? Type 'yes' and input a maximum of 9 pictures");
            String response = scanner.nextLine();
            if (response.equalsIgnoreCase("yes")) {
                System.out.println("Please input picture " + 1);
                String url = scanner.nextLine();
                int i = 1;
                while (!url.isEmpty() && i != 10) {
                    pictures.add(url);
                    i++;
                    System.out.println("Please input picture " + i);
                    url = scanner.nextLine();
                }
            }
            controller.runPostAPost(params[0], params[1], params[2], pictures, presenter);

            System.out.println(presenter.presentOutput());
        }
    }
}
