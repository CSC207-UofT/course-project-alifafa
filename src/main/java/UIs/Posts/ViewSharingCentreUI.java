package UIs.Posts;

import CommandControl.Constants;
import Controllers.PostsSharingController.ViewAndNotification.GetSharingCenterController;
import Presenters.Post.SharingCentrePresenter;
import UIs.ParentUI;

public class ViewSharingCentreUI extends ParentUI {
    /**
     * A user interface to view the posts inside its sharing centre.
     */

    @Override
    public void run() {
        GetSharingCenterController sharingController = new GetSharingCenterController();
        SharingCentrePresenter sharingPresenter = new SharingCentrePresenter();

        String[] params = new String[1];

        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser == null) {
            System.out.println("You need to log in first!");
        } else {
            params[0] = currentUser;
            sharingController.runRetrieveSharingCentre(params[0], sharingPresenter);
            System.out.println(sharingPresenter.presentOutput());
        }
    }
}
