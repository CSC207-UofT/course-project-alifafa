package UIs.RegistrationLogin;

import CommandControl.Constants;
import Controllers.UserControllers.RegistrationAndLogIn.EditPasswordController;
import Presenters.EditPasswordPresenter;
import UIs.ParentUI;

import java.io.IOException;
import java.util.Scanner;

public class EditPasswordUI extends ParentUI {

    @Override
    public void run() throws IOException {
        EditPasswordController controller = new EditPasswordController();
        EditPasswordPresenter presenter = new EditPasswordPresenter();
        Constants constants = new Constants();

        String currentUser = constants.getCurrentUser();

        if (currentUser==null){
            System.out.println("You need to log in first!");
        } else{
            String[] parameters = new String[2];

            parameters[1] = currentUser;
            System.out.println("The current logged in user is " + parameters[1]);

            System.out.println("Please type the new password");
            Scanner scanner = new Scanner(System.in);
            parameters[0] = scanner.nextLine();

            controller.editPassword(parameters, presenter);
            System.out.println(presenter.presentOutput());
        }
    }
}
