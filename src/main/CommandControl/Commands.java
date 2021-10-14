package main.CommandControl;

import main.Controllers.Controller;

import java.util.HashMap;
import java.util.Map;

/** This class contain all the valid commands.
 *
 * This is an Entity class.
 */

public class Commands {
    private HashMap<String, Controller> validCommands;

    public Commands (){
        validCommands = new HashMap<String, Controller>();
    }

    public Commands (HashMap<String, Controller> validCommands){
        this.validCommands = validCommands;
    }

    public void setValidCommands(HashMap<String, Controller> validCommands) {
        this.validCommands = validCommands;
    }

    public void addCommands(String input, Controller controller){
        validCommands.put(input, controller);
    }

    public HashMap<String, Controller> getValidCommands(){
        return this.validCommands;
    }
}
