package CommandControl;

import java.util.Scanner;

/** This is the interface and read user's command.
 *
 */

public class CommandHelper {

    /** This reads from the keyborad.
     * Then decides which controller to user.
     * For example, the user needs to type "chat" to begin chatting task. In this case, the MessageFriend
     * Controller will be used.
     * @param validCommands A commands object which maps valid command to corresponding controller.
     * @return return the corresponding Controller. Will return null if such controller does not exist.
     */
    public String readCommand(Constants validCommands) {
        String command = null;
        Constants constants = new Constants();

        while (!validCommands.isValid(command)) {

            System.out.println("Hello! Please type a valid command to begin (eg. type 'log in', " +
                    "'create an account', 'add friend', 'chat', 'create a group', 'join group', 'group chat', " +
                    "'sharing center', 'comment post', 'post a post', 'like post', 'delete post', 'view posts')");
            Scanner scanner = new Scanner(System.in);
            command = scanner.nextLine();
        }
        return command;
    }
}



