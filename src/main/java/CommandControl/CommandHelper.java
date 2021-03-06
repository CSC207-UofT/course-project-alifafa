package CommandControl;

import java.util.Scanner;

/**
 * This is the interface and read user's command.
 */

public class CommandHelper {

    /**
     * This reads from the keyboard.
     * Then decides which controller to user.
     * For example, the user needs to type "chat" to begin chatting task. In this case, the MessageFriend
     * Controller will be used.
     *
     * @param validCommands A commands object which maps valid command to corresponding controller.
     * @return return the corresponding Controller. Will return null if such controller does not exist.
     */
    public String readCommand(Constants validCommands) {
        String command = "";

        while (!validCommands.isValid(command) && !(command.equals("log in"))) {

            System.out.println("Hello! Please type a valid command to begin (eg. type 'log in', " +
                    "'create an account', 'add friend', 'remove friend', " +
                    "'chat', 'create a group', 'join group', 'group chat', 'group kick', " +
                    "'sharing center', 'comment post', 'post a post', 'like post'," +
                    "'view posts', 'notification', 'edit password', 'add blocked user')");


            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();

        }
        return command;
    }
}



