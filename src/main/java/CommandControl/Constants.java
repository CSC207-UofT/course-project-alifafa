package CommandControl;

import Controllers.ChatControllers.PtoGChatController;
import Controllers.ChatControllers.PtoPChatController;
import Controllers.Controller;
import Controllers.UserControllers.CreateGroupController;
import Controllers.UserControllers.JoinGroupController;
import Controllers.UserControllers.AccountRegistrationController;
import Controllers.UserControllers.LogInController;
import Controllers.UserControllers.MessageFriendController;

import java.util.HashMap;

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
        validCommands.put("create a group", new CreateGroupController());
        validCommands.put("join a group", new JoinGroupController());
        validCommands.put("message", new MessageFriendController());
        validCommands.put("add friend", new MessageFriendController());
        validCommands.put("PtoP chat", new PtoPChatController());
        validCommands.put("PtoG chat", new PtoGChatController());

        commandHashMap.put("log in", new LogInCommand());
        commandHashMap.put("create an account", new AccountRegistrationCommand());
        commandHashMap.put("create a group", new CreateGroupCommand());
        commandHashMap.put("join a group", new JoinGroupCommand());
        commandHashMap.put("message", new MessageFriendCommand());
        commandHashMap.put("add friend", new AddFriendCommand());
        commandHashMap.put("PtoP chat", new PtoPChatCommand());
        commandHashMap.put("PtoG chat", new PtoGChatCommand());
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
