package Gateway;

import DataAccessInterface.DataAccess;

import java.io.*;
// a Gateway for User, docstrings of methods below are in its corresponding interface
public class DataAccessGateway implements DataAccess {

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
    public <T> T readFromFile(String filepath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream(filepath);
        ObjectInputStream input = new ObjectInputStream(file);

        T read = (T) input.readObject();
        input.close();
        return read;
    }
}
