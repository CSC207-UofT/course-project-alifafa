package CommandControl;

import Controllers.Controller;

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
    public String readCommand(CommandExecutor commandExecutor, Constants validCommands) {
        boolean valid = false;
        String command = null;
        while (!valid) {
            System.out.println("Hello! Please type a valid command to begin (eg. type 'log in', 'message', " +
                    "'create an account', 'add friend')");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            valid = commandExecutor.isValid(command, validCommands);
        }
        return command;
    }


    /**
     * This method will prompt the user to enter information based on the task they want to fulfil.
     * For example, if the user wants to chat with someone, the task would be "message".
     * This method will ask the user to enter the information (their friend's name in this case).
     * @param task the task that the user want to do.
     * @param constants The hashmap contains list of valid commands and their controllers.
     * @return return an array of user's input
     */
    public String[] getParameters(String task, Constants constants){
        Scanner scanner = new Scanner(System.in);
        Controller controller = constants.getController(task);
        int numParametersNeeded = controller.numOfPrompt();
        String[] userInput = new String[numParametersNeeded + 1];
        System.out.println("You need to enter " + numParametersNeeded + " pieces of information");
        for(int i = 0; i < numParametersNeeded; i++) {
            System.out.println("Enter your " + controller.getUserPrompt().get(i));
            userInput[i] = scanner.nextLine();
        }
        System.out.println("please enter your ID");
        userInput[numParametersNeeded] = scanner.nextLine();
        System.out.println("Thank you! Please wait while we process your information.");
        return userInput;
    }


}



