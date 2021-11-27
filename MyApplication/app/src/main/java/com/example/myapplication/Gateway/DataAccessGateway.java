package com.example.myapplication.Gateway;

import com.example.myapplication.DataAccessInterface.DataAccess;

import java.io.*;

public class DataAccessGateway implements DataAccess {

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
        FileInputStream file = new FileInputStream(filepath);
        ObjectInputStream input = new ObjectInputStream(file);

        T read = (T) input.readObject();
        input.close();
        return read;
    }
}