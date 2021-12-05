package com.example.myapplication.UseCase;
import com.example.myapplication.DataAccessInterface.PtoGMessageDataAccessInterface;
import com.example.myapplication.Entity.PtoGMessage;
import com.example.myapplication.Entity.User;
import com.example.myapplication.Entity.Group;
import com.example.myapplication.Gateway.PtoGMessageDataAccess;
import com.example.myapplication.InputBoundary.PtoGMessageInputBoundary;
import com.example.myapplication.OutputBoundary.PtoGMessageOutputBoundary;


import java.io.IOException;
import java.util.HashMap;

public class PtoGMessageManager implements PtoGMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    // ptoPMessageDataAccessInterface of this class, which is implemented by PtoPMessageDataAccess.It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoGMessageDataAccessInterface PtoGDataAccessInterface = new PtoGMessageDataAccess();


    @Override
    public void sendGroupMessage(User user, Group group, PtoGMessage message) throws IOException {


        String GroupChatFile = group.getGroupName() + "GroupChatHistory.txt";

        saveGroupChatHistory(group, GroupChatFile, message);

    }

    //Helps to save ChatHistory of sender and receiver separately.
    private void saveGroupChatHistory(Group group, String GroupChatFile, PtoGMessage message) throws IOException {

        String groupID = group.getGroupID();

        try {
            //get the previous chat history of sender.
            HashMap<String, String> GroupChatHistory
                    = PtoGDataAccessInterface.ReadFromFile(GroupChatFile);

            //update chat history of  sender.
            String history = GroupChatHistory.get(groupID);
            String newHistory = history + "\n" + message.toString();
            GroupChatHistory.put(groupID, newHistory);

            //save new chat history of sender.
            PtoGDataAccessInterface.SaveToFile(GroupChatFile, GroupChatHistory);
        } catch (IOException | ClassNotFoundException e) {
            HashMap<String, String> senderChatHistory = new HashMap<>();
            senderChatHistory.put(groupID, message.toString());
            //save new chat history of sender.
            PtoGDataAccessInterface.SaveToFile(GroupChatFile, senderChatHistory);
        }
    }

    @Override
    public void GroupMessageHistory(User user, Group group, PtoGMessageOutputBoundary outputBoundary) {

        String GroupChatFile = group.getGroupName() + "PtoPChatHistory.txt";

        try {
            //get the chat history of receiver.
            HashMap<String, String> GroupChatHistory
                    = PtoGDataAccessInterface.ReadFromFile(GroupChatFile);
            //store the chat history between receiver and sender
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
