package Controllers.WriteAndReadFileControllers;


import UseCase.GroupManager;
import UseCase.UserManager;

import java.io.IOException;

// a controller helps to read and write data for user
public class ReadAndWriteController {
    public void readData() throws IOException, ClassNotFoundException {
        UserManager manager = new UserManager();
        manager.readData();
    }

    public void readGroupData() throws IOException, ClassNotFoundException {
        GroupManager manager = new GroupManager();
        manager.readGroupData();
    }
}