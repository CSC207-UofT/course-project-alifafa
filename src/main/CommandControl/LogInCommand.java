package main.CommandControl;

import main.Controllers.Controller;
import main.Controllers.UserControllers.LogInController;

public class LogInCommand extends Command{

    LogInController logInController = new LogInController();

    @Override
    /*
     * This method is responsible for log in task. It will use LogInController and the user's input.
     * @param userInput This is the user's input we get from the keyboard.
     */
    public void run (String[] userInput){
        boolean successfulLogIn = logInController.checkMatch(userInput);
        if(!successfulLogIn){
            System.out.println("It does not seem correct. Please re-enter your information");
        } else {
            System.out.println("Your are logged in!");
        }
    }
}
