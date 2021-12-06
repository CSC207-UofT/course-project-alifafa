
import CommandControl.CommandHelper;
import CommandControl.Constants;
import CommandDesignPattern.*;
import Controllers.UserControllers.ReadAndWriteController;

import java.io.IOException;
import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        ReadAndWriteController readAndWriteController = new ReadAndWriteController();
        readAndWriteController.readData();
        readAndWriteController.readGroupData();

        CommandHelper commandUI = new CommandHelper();
        Constants commands = new Constants();

        Scanner in = new Scanner(System.in);
        String quit = "no";
        while (quit.equals("no")){
            // keep reading the command and executing it until user exits the program
            String task = commandUI.readCommand(commands);

            if(task.equals("log in")){
                // This is a demonstration of CommandDesignPattern
                Receiver receiver = new LogInReceiver();
                Command logInCommand = new LogInCommand(receiver);
                Invoker invoker = new Invoker(logInCommand);
                invoker.execute();


            } else {
                commands.getUI(task).run();
                System.out.println("");
                System.out.println("Do you want to exit (Type 'yes' or 'no')");
                quit = in.nextLine();
                while (!(quit.equals("no") || quit.equals("yes"))) {
                    System.out.println("Please type a valid command (yes or no)");
                    quit = in.nextLine();
                }
                System.out.println("");
            }
        }
        System.out.println("");

        in.close();
    }

}
