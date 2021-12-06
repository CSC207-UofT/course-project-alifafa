package Controllers.UserControllers;


import UseCase.UserManager;

import java.io.IOException;

public class ReadAndWriteController {
    public void readData () throws IOException, ClassNotFoundException {
        UserManager manager = new UserManager();
        manager.readData();
    }
}