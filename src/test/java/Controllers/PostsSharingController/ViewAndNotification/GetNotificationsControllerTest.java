package Controllers.PostsSharingController.ViewAndNotification;

import Entity.Users.User;
import Presenters.Post.NotificationPresenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetNotificationsControllerTest {

    /**
     *
     * Method: runRetrieveNotifications()
     *
     */
    @Test
    void runRetrieveNotifications() {
        GetNotificationsController controller = new GetNotificationsController();
        NotificationPresenter presenter = new NotificationPresenter();
        User user = new User("lucas", "123");
        controller.runRetrieveNotifications(user.getUserName(), presenter);
        assertEquals(0, presenter.presentOutput().size());
    }
}