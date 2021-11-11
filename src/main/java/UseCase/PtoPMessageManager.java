package UseCase;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.PtoPMessage;
import Entity.User;
import UseCases.UseCase;
import InputBoundary.PtoPMessageInputBoundary;
import OutputBoundary.PtoPMessageOutputBoundary;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class PtoPMessageManager extends UseCase implements PtoPMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    // ptoPMessageDataAccessInterface of this class, which is implemented by PtoPMessageDataAccess.It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface;

    //Constructor of PtoPMessageManager
    public PtoPMessageManager(PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface){
        this.ptoPMessageDataAccessInterface = ptoPMessageDataAccessInterface;
    }

    @Override
    public  void sendMessage(User sender, User receiver, PtoPMessage message) throws IOException {

        sender.addMessage(receiver, message);
        receiver.addMessage(sender, message);

        String senderChatFile = sender.getUserName() + "PtoPChatHistory.txt";
        String receiverChatFile = receiver.getUserName() + "PtoPChatHistory.txt";

        saveChatHistory(sender, receiver, senderChatFile);

        saveChatHistory(receiver, sender, receiverChatFile);
    }

    //Helps to save ChatHistory of sender and receiver separately.
    private void saveChatHistory(User sender, User receiver, String senderChatFile) throws IOException {
        try {
            //get the previous chat history of sender.
            HashMap<User, ArrayList<PtoPMessage>> senderChatHistory
                    = ptoPMessageDataAccessInterface.readFromFile(senderChatFile);
            //update chat history of  sender.
            senderChatHistory.put(receiver, sender.getMessage(receiver));
            //save new chat history of sender.
            ptoPMessageDataAccessInterface.saveToFile(senderChatFile, senderChatHistory);
        } catch (IOException | ClassNotFoundException e) {
            HashMap<User, ArrayList<PtoPMessage>> senderChatHistory = new HashMap<>();
            senderChatHistory.put(receiver, sender.getMessage(receiver));
            //save new chat history of sender.
            ptoPMessageDataAccessInterface.saveToFile(senderChatFile, senderChatHistory);
        }
    }

    @Override
    public void receiveMessageHistory(User receiver, User sender, PtoPMessageOutputBoundary outputBoundary){
        String receiverChatFile = receiver.getUserName() + "PtoPChatHistory.txt";
        try {
            //get the chat history of receiver.
            HashMap<User, ArrayList<PtoPMessage>> receiverChatHistory
                    = ptoPMessageDataAccessInterface.readFromFile(receiverChatFile);
            //store the chat history between receiver and sender
            if (receiverChatHistory.containsKey(sender)){
                ArrayList<PtoPMessage> history= receiverChatHistory.get(sender);
                StringBuilder formattedHistory = new StringBuilder();
                for (PtoPMessage message: history){
                    formattedHistory.append(message.toString()).append("\n");
                }
                outputBoundary.store(formattedHistory.toString());
            }else{
                outputBoundary.store("");
            }
        } catch (IOException | ClassNotFoundException e) {
            outputBoundary.store("");
        }}

    @Override
    public PtoPMessage createMessage(User sender, User receiver, String text){
        return new PtoPMessage(sender, receiver, text);
    }


//    /**
//     * Deletes a message in both sender and receiver's person-to-person message history.
//     * @param sender the sender who has right to delete the message.
//     * @param receiver the receiver of the message.
//     * @param message the message sent from sender to receiver.
//     */
//    public void deleteMessage(User sender, User receiver, PtoPMessage message){
//        sender.deleteMessage(receiver, message);
//        receiver.deleteMessage(sender, message);
//    }


}
