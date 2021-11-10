package DataAccess;

import Entity.StoreUser;

import java.io.*;

public class UserDataAccess implements DataAccess{
    @Override
    public void saveToFile(String filepath, Object o) throws IOException {
        FileOutputStream file = new FileOutputStream("User_State.csv");
        ObjectOutputStream output = new ObjectOutputStream(file);
        output.writeObject(o);
        output.flush();
        output.close();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T> T readFromFile(String filepath) throws IOException, ClassNotFoundException {
        FileInputStream file = new FileInputStream("User_State.csv");
        ObjectInputStream output = new ObjectInputStream(file);
        StoreUser stored = (StoreUser) output.readObject();
        output.close();
        return (T) stored;
    }
}
