package UIs;

import Controllers.UserControllers.AccountRegistrationController;
import Controllers.UserControllers.LogInController;
import Presenters.AccountRegistrationPresenter;
import Presenters.LogInPresenter;

import java.util.Scanner;

public class AccountRegistrationUI {
    /**
     * A user interface for account registration, will receive feedback from AccountRegistrationPresenter.
     */



    public void run(AccountRegistrationController controller, AccountRegistrationPresenter presenter) {
        String[] parameters = new String[3];
        Scanner scanner = new Scanner(System.in);
        System.out.println("ID: ");
        parameters[0] = scanner.nextLine();
        System.out.println("Username: ");
        parameters[1] = scanner.nextLine();
        System.out.println("Password: ");
        parameters[2] = scanner.nextLine();

        controller.createAnAccount(parameters, presenter);
        System.out.println(presenter.presentOutput());
    }
}
