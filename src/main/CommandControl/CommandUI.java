package main.CommandControl;

import main.Controllers.Controller;
import main.Controllers.UserControllers.AccountRegistrationController;
import main.Controllers.UserControllers.LogInController;
import main.Controllers.UserControllers.MessageFriendController;

import java.util.Scanner;

/** This is the interface and read user's command.
 *
 */

public class CommandUI {

    public Controller readCommand(CommandExecutor commandExecutor, Commands validCommands) {
        boolean valid = false;
        String command = null;
        while (!valid) {
            System.out.println("Hello! Please type a valid command to begin (eg. type 'log in')");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            valid = commandExecutor.isValid(command, validCommands);
        }
        return commandExecutor.getController(command, validCommands);
    }


    public String[] getParameters(Controller controller){
        Scanner scanner = new Scanner(System.in);
        int numParametersNeeded = controller.numOfPrompt();
        String[] userInput = new String[numParametersNeeded];
        System.out.println("You need to enter " + numParametersNeeded + "pieces of information");
        for(int i = 0; i < numParametersNeeded; i++) {
            System.out.println("Enter your " + controller.getUserPrompt().get(i));
            userInput[i] = scanner.nextLine();
        }
        System.out.println("Thank you! Please wait while we process your information.");
        return userInput;
    }

    public void logIn (LogInController controller, String[] userInput){
        boolean successfulLogIn = controller.checkMatch(userInput);
        if(!successfulLogIn){
            System.out.println("It does not seem correct. Please re-enter your information");
        } else {
        System.out.println("Your are logged in!");
        }
    }

    public void creatAnAccount(AccountRegistrationController controller, String[] userInput){
        boolean existingID = controller.checkID(userInput[0]);
        if(existingID){
            System.out.println("This ID already exists. Please use another one.");
        } else {
            controller.createAnAccount(userInput);
            System.out.println("Your account is successfully created!");
        }
    }

    public void messageAFriend(MessageFriendController controller, String[] userInput){
        if(controller.checkFriend(userInput)){
            System.out.println("Please wait while we find your friend");
        } else {
            System.out.println("It seems like you don't have this contact. " +
                    "Please re-enter the information.");
        }
    }
}



