package UseCase;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.Message.PtoPMessage;
import Entity.Users.User;
import Gateway.PtoPMessageDataAccess;
import InputBoundary.PtoPMessageInputBoundary;
import OutputBoundary.Message.PtoP.PtoPMessageOutputBoundary;

import java.io.IOException;
import java.util.HashMap;

public class PtoPMessageManager implements PtoPMessageInputBoundary {
    /**
     * A manager that can manage messages between two users.
     */

    // ptoPMessageDataAccessInterface of this class, which is implemented by PtoPMessageDataAccess.It should be
    // constructed outside this class, then injected into this class's constructor.
    private final PtoPMessageDataAccessInterface ptoPMessageDataAccessInterface = new PtoPMessageDataAccess();

    @Override
    public void sendMessage(User sender, User receiver, PtoPMessage message) throws IOException {


        String senderChatFile = sender.getUserName() + "PtoPChatHistory.txt";
        String receiverChatFile = receiver.getUserName() + "PtoPChatHistory.txt";

        saveChatHistory(receiver, senderChatFile, message);

        saveChatHistory(sender, receiverChatFile, message);
    }

    //Helps to save ChatHistory of sender and receiver separately.
    private void saveChatHistory(User receiver, String senderChatFile, PtoPMessage message) throws IOException {

        String receiverUsername = receiver.getUserName();

        try {
            //get the previous chat history of sender.
            HashMap<String, String> senderChatHistory
                    = ptoPMessageDataAccessInterface.readFromFile(senderChatFile);

            //update chat history of  sender.
            String history = senderChatHistory.get(receiverUsername);
            String newHistory = history + "\n" + message.toString();
            senderChatHistory.put(receiverUsername, newHistory);

            //save new chat history of sender.
            ptoPMessageDataAccessInterface.saveToFile(senderChatFile, senderChatHistory);
        } catch (IOException | ClassNotFoundException e) {
            HashMap<String, String> senderChatHistory = new HashMap<>();
            senderChatHistory.put(receiverUsername, message.toString());
            //save new chat history of sender.
            ptoPMessageDataAccessInterface.saveToFile(senderChatFile, senderChatHistory);
        }
    }

    @Override
    public void receiveMessageHistory(User receiver, User sender, PtoPMessageOutputBoundary outputBoundary){

        String receiverChatFile = receiver.getUserName() + "PtoPChatHistory.txt";

        try {
            //get the chat history of receiver.
            HashMap<String, String> receiverChatHistory
                    = ptoPMessageDataAccessInterface.readFromFile(receiverChatFile);
            //store the chat history between receiver and sender
            if (receiverChatHistory.containsKey(sender.getUserName())){
                String history= receiverChatHistory.get(sender.getUserName());
                outputBoundary.store(history);
            }else{
                outputBoundary.store("");
            }
        } catch (IOException | ClassNotFoundException e) {
//            if (currentHistory.isEmpty()){
            outputBoundary.store("");
//            }else{
//                StringBuilder formattedHistory = new StringBuilder();
//                for (PtoPMessage message: currentHistory){
//                    formattedHistory.append(message.toString()).append("\n");
//                }
////                outputBoundary.store(formattedHistory.toString());
//                outputBoundary.store("b");
        }
    }

    @Override
    public PtoPMessage createMessage(User sender, User receiver, String text){
        return new PtoPMessage(sender, receiver, text);
    }


}
