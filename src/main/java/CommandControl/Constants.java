package CommandControl;

//TODO import Controllers.PostControllers.ParPostController;
//TODO import Controllers.PostControllers.PicPostController;
import UIs.*;

import java.util.HashMap;

/** This class contain all the valid commands.
 *
 * This is an Entity class.
 */

public class Constants {
    private HashMap<String, ParentUI> validCommands;

    public Constants(){
        validCommands = new HashMap<>();

        validCommands.put("log in", new LoginUI());
        validCommands.put("create an account", new AccountRegistrationUI());
        validCommands.put("message", new PtoPChatUI());
        validCommands.put("add friend", new AddFriendUI());
        validCommands.put("chat", new PtoPChatUI());
        validCommands.put("create a group", new CreateGroupUI());
        validCommands.put("join group", new JoinGroupUI());
        validCommands.put("group chat", new PtoGChatUI());
//      TODO:  validCommands.put("share picture post", new PostUI());
//        validCommands.put("share paragraph post", new PostUI());
    }


    public Constants(HashMap<String, ParentUI> UIs){
        this.validCommands = UIs;
    }

    public void setValidCommands(HashMap<String, ParentUI> validCommands) {
        this.validCommands = validCommands;
    }

    public void addUI(String input, ParentUI UI){
        validCommands.put(input, UI);
    }

    public ParentUI getUI(String taskName){
        return this.validCommands.get(taskName);
    }


    /**
     * Check if the task is a valid command in our command list.
     * @param taskName The task the user wants to complete.
     * @return a boolean indicating whether the task is valid.
     */
    public boolean isValid(String taskName){
        return validCommands.containsKey(taskName);
    }



}