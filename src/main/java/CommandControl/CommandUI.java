package CommandControl;

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
                    "'create an account', 'add friend', 'chat')");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
            valid = commandExecutor.isValid(command, validCommands);
        }
        return command;
    }
}



