package com.example.myapplication.DataAccessInterface;

import java.io.IOException;
import java.util.HashMap;

public interface PtoGMessageDataAccessInterface {

    // save a user's chat history data to filepath.
    void SaveToFile(String filepath, Object o) throws IOException;

    // convert data in filepath to a user's chat history data.
    //key is the userID, value is the user's chat history
    HashMap<String, String> ReadFromFile(String filepath) throws IOException, ClassNotFoundException;


}