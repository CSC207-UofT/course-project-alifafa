package Gateway;

import DataAccessInterface.PtoGMessageDataAccessInterface;

import java.io.*;
import java.util.HashMap;
// a Gateway for PTOG message, docstrings of methods below are in its corresponding interface
public class PtoGMessageDataAccess implements PtoGMessageDataAccessInterface {

    @Override
    public void SaveToFile(String filepath, Object o) throws IOException {
        FileOutputStream file = new FileOutputStream(filepath);
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(o);
        output.flush();
        output.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public HashMap<String, String> ReadFromFile(String filepath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filepath);
        ObjectInputStream input = new ObjectInputStream(file);
        HashMap<String, String> read = (HashMap<String, String>)input.readObject();
        input.close();
        return read;
    }
}