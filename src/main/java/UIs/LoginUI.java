package UIs;

import CommandControl.Constants;
import Controllers.UserControllers.LogInController;
import Presenters.LogInPresenter;

import java.util.Scanner;

public class LoginUI extends ParentUI{

    /**
     * A user interface for logging in, will receive feedback from LogInPresenter..
     */

    /*
     * This method is responsible for log in task. It will use LogInController and the user's input.
     * @param userInput This is the user's input we get from the keyboard.
     */
    public void run () {
        Constants constants = new Constants();
        LogInController controller = new LogInController();
        LogInPresenter presenter = new LogInPresenter();
        String[] parameters = new String[2];

        System.out.println("userName: ");
        Scanner scanner = new Scanner(System.in);
        parameters[0] = scanner.nextLine();
        System.out.println("Password: ");
        parameters[1] = scanner.nextLine();

        controller.runLogIn(parameters, presenter);
        if (presenter.isLoggedIn()){
            constants.setCurrentUser(parameters[0]);
            System.out.println("Username "+ parameters[0]+" is logged in.");
        }
        System.out.println(presenter.presentOutput());
    }
}
