package Gateway;

import DataAccessInterface.PtoPMessageDataAccessInterface;
import Entity.PtoPMessage;
import Entity.User;


import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;

public class PtoPMessageDataAccess implements PtoPMessageDataAccessInterface {

    @Override
    public void saveToFile(String filepath, Object o) throws IOException {
        FileOutputStream file = new FileOutputStream(filepath);
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(o);
        output.flush();
        output.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public HashMap<User, ArrayList<PtoPMessage>> readFromFile(String filepath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filepath);
        ObjectInputStream input = new ObjectInputStream(file);
        HashMap<User, ArrayList<PtoPMessage>> read = (HashMap<User, ArrayList<PtoPMessage>>)input.readObject();
        input.close();
        return read;
    }
}
