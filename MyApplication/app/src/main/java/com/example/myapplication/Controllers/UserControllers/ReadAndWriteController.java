package com.example.myapplication.Controllers.UserControllers;

import com.example.myapplication.UseCase.GroupManager;
import com.example.myapplication.UseCase.UserManager;

import java.io.IOException;

public class ReadAndWriteController {
    public void readData () throws IOException, ClassNotFoundException {
        UserManager manager = new UserManager();
        manager.readData();
    }

    public void readGroupData () throws IOException, ClassNotFoundException {
        GroupManager manager = new GroupManager();
        manager.readGroupData();
    }
}


