package UIs.RegistrationLogin;

import Controllers.UserControllers.RegistrationAndLogIn.AccountRegistrationController;
import Presenters.User.AccountRegistrationPresenter;
import UIs.ParentUI;


import java.io.IOException;
import java.util.Scanner;

public class AccountRegistrationUI extends ParentUI {
    /**
     * A user interface for account registration, will receive feedback from AccountRegistrationPresenter.
     */



    public void run() throws IOException {
        AccountRegistrationController controller = new AccountRegistrationController();
        AccountRegistrationPresenter presenter = new AccountRegistrationPresenter();
        String[] parameters = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Username: ");
        parameters[0] = scanner.nextLine();
        System.out.println("Password: ");
        parameters[1] = scanner.nextLine();
        System.out.println("Re-enter your Password (the password need to match): ");
        parameters[2] = scanner.nextLine();

        controller.createAnAccount(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}
