package UseCase;

import DataAccessInterface.PtoGMessageDataAccessInterface;
import Entity.Group;
import Entity.PtoGMessage;
import Entity.User;
import Gateway.PtoGMessageDataAccess;
import InputBoundary.PtoGMessageInputBoundary;
import OutputBoundary.PtoGMessageOutputBoundary;

import java.util.ArrayList;

import java.io.IOException;
import java.util.HashMap;

public class PtoGMessageManager implements PtoGMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    // PtoGMessageDataAccessInterface of this class, which is implemented by PtoGMessageDataAccess.It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoGMessageDataAccessInterface PtoGDataAccessInterface = new PtoGMessageDataAccess();

    @Override
    public void sendGroupMessage(User user, Group group, PtoGMessage message) throws IOException {

        String GroupChatFile = group.getGroupName() + "GroupChatHistory.txt";
        saveGroupChatHistory(group, GroupChatFile, message);

    }

    //Helps to save GroupChatHistory of a group.
    private void saveGroupChatHistory(Group group, String GroupChatFile, PtoGMessage message) throws IOException {

        String groupID = group.getGroupID();

        try {
            HashMap<String, String> GroupChatHistory
                    = PtoGDataAccessInterface.ReadFromFile(GroupChatFile);
            //update chat history
            String history = GroupChatHistory.get(groupID);
            String newHistory = history + "\n" + message.toString();
            GroupChatHistory.put(groupID, newHistory);
            PtoGDataAccessInterface.SaveToFile(GroupChatFile, GroupChatHistory);
        } catch (IOException | ClassNotFoundException e) {
            HashMap<String, String> groupChatHistory = new HashMap<>();
            groupChatHistory.put(groupID, message.toString());
            PtoGDataAccessInterface.SaveToFile(GroupChatFile, groupChatHistory);
        }

    }

    @Override
    public void GroupMessageHistory(User user, Group group, PtoGMessageOutputBoundary outputBoundary) {

        String GroupChatFile = group.getGroupName() + "GroupChatHistory.txt";

        try {
            HashMap<String, String> GroupChatHistory
                    = PtoGDataAccessInterface.ReadFromFile(GroupChatFile);
            if (GroupChatHistory.containsKey(group.getGroupID())) {
                String history = GroupChatHistory.get(group.getGroupID());
                outputBoundary.store(history);
            } else {
                outputBoundary.store("");
            }
        } catch (IOException | ClassNotFoundException e) {
            outputBoundary.store("");
        }
    }

    @Override
    public PtoGMessage createMessage(User sender, Group group, String text) {
        return new PtoGMessage(sender, group, text);
    }



}
