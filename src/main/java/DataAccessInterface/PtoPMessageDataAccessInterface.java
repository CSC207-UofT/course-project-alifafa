package DataAccessInterface;

import Entity.PtoPMessage;
import Entity.User;

import java.io.IOException;
import java.util.ArrayList;

public interface PtoPMessageDataAccessInterface {

    // save ptop message data to filepath.
    void saveToFile(String filepath, Object o) throws IOException;

    // convert data in filepath to ptop message data.
    public ArrayList<PtoPMessage> readFromFile(String filepath) throws IOException, ClassNotFoundException;


}
