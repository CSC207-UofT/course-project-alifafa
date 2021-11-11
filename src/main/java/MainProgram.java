import CommandControl.CommandExecutor;
import CommandControl.CommandUI;
import CommandControl.Constants;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {

        CommandUI commandUI = new CommandUI();
        CommandExecutor commandExecutor = new CommandExecutor();
        Constants commands = new Constants();

        Scanner in = new Scanner(System.in);
        String quit = "no";
        while (quit.equals("no")){
            // keep reading the command and executing it until user exits the program
            String task = commandUI.readCommand(commandExecutor, commands);
            String[] parameters = commandUI.getParameters(task,commands);
            commandExecutor.runCommand(task,parameters,commands);
            System.out.println("Do you want to exit (Type 'yes' or 'no')");
            quit = in.nextLine();
        }
        in.close();
    }

}
