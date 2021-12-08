package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.ViewAndNotification.GetNotificationsController;
import Presenters.Post.NotificationPresenter;
import UIs.ParentUI;

import java.io.IOException;

public class ViewNotificationsUI extends ParentUI {
    /**
     * A user interface that displays the notifications to the user
     * of whether someone liked or commented his/her posts
     */

    GetNotificationsController controller = new GetNotificationsController();
    NotificationPresenter presenter = new NotificationPresenter();

    @Override
    public void run() throws IOException {
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();
        String[] params = new String[1];

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            controller.runRetrieveNotifications(params[0], presenter);
            System.out.println(presenter.presentOutput());
        }
    }
}
