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

    /** This reads from the keyborad.
     * Then decides which controller to user.
     * For example, the user needs to type "chat" to begin chatting task. In this case, the MessageFriend
     * Controller will be used.
     * @param commandExecutor It determines if the input is a valid command.
     * @param validCommands A commands object which maps valid command to corresponding controller.
     * @return return the corresponding Controller. Will return null if such controller does not exist.
     */
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


    /**
     * This method will prompt the user to enter information based on the task they want to fulfil.
     * For example, if the user wants to chat with someone, the controller would be MessageFriendController.
     * This method will ask the user to enter the information (their friend's name in this case).
     * @param controller the controller that is responsible for this task
     * @return return an array of user's input
     */
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

    /**
     * This method is responsible for log in task. It will use LogInController and the user's input.
     * @param controller This is the LogInController. It has a checkMatch method that
     *      * check if the user's username and password matches.
     * @param userInput This is the user's input we get from the keyboard.
     */
    public void logIn (LogInController controller, String[] userInput){
        boolean successfulLogIn = controller.checkMatch(userInput);
        if(!successfulLogIn){
            System.out.println("It does not seem correct. Please re-enter your information");
        } else {
        System.out.println("Your are logged in!");
        }
    }

    /**
     * This method is reponsible for create an account.
     * @param controller AccountResgistrationController, which has a checkID method that checks if
     *                   user's desired ID is used. It also has a createAnAccount, which can create
     *                   use UserManager to create a new User account.
     * @param userInput Ths user's input from keyboard, it has ID, username, password.
     */
    public void creatAnAccount(AccountRegistrationController controller, String[] userInput){
        boolean existingID = controller.checkID(userInput[0]);
        if(existingID){
            System.out.println("This ID already exists. Please use another one.");
        } else {
            controller.createAnAccount(userInput);
            System.out.println("Your account is successfully created!");
        }
    }

    /**
     * This method is used after the user types 'chat'.
     * It only validates if the user has the friend they want to chat with. If such friend does not
     * exist, it will prompt the user to re-enter their friend's name.
     * @param controller MessageFriendController, which use UserManager to check if the friend exists.
     * @param userInput An array containing user's input. In this case, it should be their friend's
     *                  username.
     */
    public void messageAFriend(MessageFriendController controller, String[] userInput){
        if(controller.checkFriend(userInput)){
            System.out.println("Please wait while we find your friend");
        } else {
            System.out.println("It seems like you don't have this contact. " +
                    "Please re-enter the information.");
        }
    }
}



