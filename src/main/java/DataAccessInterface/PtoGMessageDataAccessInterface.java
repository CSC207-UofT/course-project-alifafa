package DataAccessInterface;

import java.io.IOException;
import java.util.HashMap;

public interface PtoGMessageDataAccessInterface {

    // save chat history data to filepath.
    void SaveToFile(String filepath, Object o) throws IOException;

    // read chat file from local data.
    HashMap<String, String> ReadFromFile(String filepath) throws IOException, ClassNotFoundException;


}