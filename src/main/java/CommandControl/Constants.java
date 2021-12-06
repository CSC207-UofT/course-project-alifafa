package CommandControl;

import UIs.*;

import java.util.HashMap;

/** This class contain all the valid commands.
 *
 * This is an Entity class.
 */

public class Constants {
    private final HashMap<String, ParentUI> validCommands;
    private static String currentUser;

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
        validCommands.put("view share center", new ViewSharingCentreUI());
        validCommands.put("comment post", new CommentPostUI());
        validCommands.put("post a post", new PostAPostUI());
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

    public String getCurrentUser() {
        return currentUser;
    }

    public void setCurrentUser(String currentUser) {
        Constants.currentUser = currentUser;
    }
}