
package Controllers;

import java.util.ArrayList;

/**
 * This is the parent class for all the controllers related to the user manager.
 *
 * It can be used by CommandExecutor. Each Controller subclass will have different input
 * boundaries and pass the input to different Manager (use case).
 */

public abstract class Controller{
    protected ArrayList<String> userPrompt;

    public ArrayList<String> getUserPrompt() {
        return userPrompt;
    }

    public int numOfPrompt(){
        return userPrompt.size();
    }
}