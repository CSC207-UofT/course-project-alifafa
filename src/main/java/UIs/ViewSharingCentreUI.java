package UIs;

import Controllers.PostsSharingController.GetSharingCenterController;
import Presenters.SharingCentrePresenter;

import java.util.Scanner;

public class ViewSharingCentreUI extends ParentUI{
    /**
     * A user interface to view the posts inside its sharing centre.
     */

    @Override
    public void run() {
        GetSharingCenterController sharingController = new GetSharingCenterController();
        SharingCentrePresenter sharingPresenter = new SharingCentrePresenter();

        String[] params = new String[1];

        System.out.println("The Username of the User: ");
        Scanner scanner = new Scanner(System.in);
        params[0] = scanner.nextLine();

        sharingController.runRetrieveSharingCentre(params[0], sharingPresenter);
        System.out.println(sharingPresenter.presentOutput());
    }
}
