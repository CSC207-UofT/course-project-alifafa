package CommandControl;

/**
 * This class will decide which controller to call based on the command.
 */

public class CommandExecutor {

    /**
     * Check if the command is valid.
     *
     * @param input The input command from the user.
     * @param validCommands The available commands we have.
     * @return a boolean indicating whether the command can be executed.
     */
    public boolean isValid(String input, Constants validCommands) {
        return validCommands.isValid(input);
    }



    /**
     * This method will run the command by finding the specific command object and pass the user's
     * input to it in order to run.
     * @param taskName The task that the user wants to complete
     * @param userInput The use's input info.
     * @param validCommands The constant we have that maps name of task to the command object.
     */
    public void runCommand(String taskName, String[] userInput, Constants validCommands){
        validCommands.getCommand(taskName).run(userInput);
    }
}
