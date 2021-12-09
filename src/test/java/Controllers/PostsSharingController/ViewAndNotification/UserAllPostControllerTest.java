package Controllers.PostsSharingController.ViewAndNotification;

import Entity.Users.User;
import Presenters.Post.SharingCentrePresenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserAllPostControllerTest {

    /**
     *
     * Method: runRetrieveUserAllPost()
     *
     */
    @Test
    void runRetrieveUserAllPost() {
        UserAllPostController controller = new UserAllPostController();
        SharingCentrePresenter presenter = new SharingCentrePresenter();
        User user = new User("lucas", "123");
        controller.runRetrieveUserAllPost(user.getUserName(), presenter);
        assertEquals(0, presenter.presentOutput().size());
    }
}