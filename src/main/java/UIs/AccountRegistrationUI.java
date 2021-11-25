package UIs;

import Controllers.UserControllers.AccountRegistrationController;
import Presenters.AccountRegistrationPresenter;


import java.util.Scanner;

public class AccountRegistrationUI extends ParentUI{
    /**
     * A user interface for account registration, will receive feedback from AccountRegistrationPresenter.
     */



    public void run() {
        AccountRegistrationController controller = new AccountRegistrationController();
        AccountRegistrationPresenter presenter = new AccountRegistrationPresenter();
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
