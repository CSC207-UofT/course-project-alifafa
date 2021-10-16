package CommandControl;

import Controllers.Controller;
import Controllers.UserControllers.AccountRegistrationController;
import Controllers.UserControllers.LogInController;

import java.util.HashMap;
import java.util.Map;

/** This class contain all the valid commands.
 *
 * This is an Entity class.
 */

public class Constants {
    private HashMap<String, Controller> validCommands;
    private HashMap<String, Command> commandHashMap;

    public Constants(){
        validCommands = new HashMap<>();
        commandHashMap = new HashMap<>();

        validCommands.put("log in", new LogInController());
        validCommands.put("create an account", new AccountRegistrationController());

        commandHashMap.put("log in", new LogInCommand());
        commandHashMap.put("create an account", new AccountRegistrationCommand());
    }


    public Constants(HashMap<String, Controller> controllers, HashMap<String, Command> commands){
        this.validCommands = controllers;
        this.commandHashMap = commands;
    }

    public void setValidCommands(HashMap<String, Controller> validCommands) {
        this.validCommands = validCommands;
    }

    public void addController(String input, Controller controller){
        validCommands.put(input, controller);
    }

    public Controller getController(String taskName){
        return this.validCommands.get(taskName);
    }
    public Command getCommand(String key) {
        return commandHashMap.get(key);
    }

    /**
     * Check if the task is a valid command in our command list.
     * @param taksName The task the user wants to complete.
     * @return a boolean indicating whether the task is valid.
     */
    public boolean isValid(String taksName){
        return validCommands.containsKey(taksName);
    }



    public void addCommand(String key, Command command ) {
        commandHashMap.put(key, command);
    }

    public void setCommandHashMap(HashMap<String, Command> commandHashMap) {
        this.commandHashMap = commandHashMap;
    }


}