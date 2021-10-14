package main.CommandControl;

import main.Controllers.Controller;

import java.util.HashMap;
import java.util.Map;

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
    public boolean isValid(String input, Commands validCommands) {
        HashMap<String, Controller> availableCommands = validCommands.getValidCommands();
        return availableCommands.get(input) != null;
    }

    /**
     * Get the corresponding controller for a given command.
     *
     * @param input The input command from the user.
     * @param validCommands The available commands we have.
     * @return the controller corresponding to a given command.
     */
    public Controller getController(String input, Commands validCommands){
        return validCommands.getValidCommands().get(input);
    }
}
