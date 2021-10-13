package main;

import java.util.ArrayList;
import java.util.HashMap;

public class User implements MessageStorable{

    private final HashMap<User, ArrayList<Message>> PtoPMessageHistory;

    public User(){
        this.PtoPMessageHistory = new HashMap<>();
    }

    public void addMessage(User user, Message message){
        if (! PtoPMessageHistory.containsKey(user)){
            ArrayList<Message> first = new ArrayList<>();
            first.add(message);
            PtoPMessageHistory.put(user, first);
        }
        else {
            ArrayList<Message> lst = PtoPMessageHistory.get(user);
            lst.add(message);
        }
    }



    public ArrayList<Message> getMessage(User user){
        return PtoPMessageHistory.getOrDefault(user, null);
    }


    public void deleteMessage(User user, Message message){
        ArrayList<Message> lst = PtoPMessageHistory.get(user);
        lst.remove(message);
    }


}


