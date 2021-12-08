package UIs.RegistrationLogin;

import CommandControl.Constants;
import Controllers.UserControllers.RegistrationAndLogIn.LogOutController;
import Presenters.User.LogOutPresenter;
import UIs.ParentUI;

public class LogoutUI extends ParentUI {

    public void run() {

        Constants constants = new Constants();
        String currentUser = constants.getCurrentUser();

        LogOutController controller = new LogOutController();
        LogOutPresenter presenter = new LogOutPresenter();


        if(currentUser != null){
            controller.runLogOut(currentUser);
            if (!presenter.isLoggedIn()){
                System.out.println(presenter.presentOutput());
                constants.setCurrentUser(null);
            }
        }else{
            System.out.println("Please log in first!");
        }
    }
}
