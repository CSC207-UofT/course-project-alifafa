package Controllers.PostsSharingController.ViewAndNotification;

import Entity.Users.User;
import Presenters.Post.SharingCentrePresenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GetSharingCenterControllerTest {

    /**
     *
     * Method: runRetrieveSharingCentre()
     *
     */
    @Test
    void runRetrieveSharingCentre() {
        GetSharingCenterController controller = new GetSharingCenterController();
        SharingCentrePresenter presenter = new SharingCentrePresenter();
        User user = new User("lucas", "123");
        controller.runRetrieveSharingCentre(user.getUserName(), presenter);
        assertEquals(0, presenter.presentOutput().size());
    }
}