package UIs;

import Controllers.PostsSharingController.CommentPostController;
import Presenters.CommentPostPresenter;

import java.io.IOException;

public class CommentPostUI extends ParentUI{
    /**
     *
     * @throws IOException
     */

    @Override
    public void run() throws IOException {
        CommentPostController controller = new CommentPostController();
        CommentPostPresenter presenter = new CommentPostPresenter();

        String[] params = new String[3];

        System.out.println("Your Username: ");

    }
}
