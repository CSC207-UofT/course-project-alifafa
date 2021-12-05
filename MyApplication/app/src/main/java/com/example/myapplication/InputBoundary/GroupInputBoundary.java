package com.example.myapplication.InputBoundary;

import com.example.myapplication.Entity.Group;
import com.example.myapplication.OutputBoundary.*;

import java.io.IOException;

public interface GroupInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the GroupManager.
     * Controller knows nothing about the GroupManager but it can use InputBoundary instead.
     */

    void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) throws IOException;

    void runJoinGroup(String[] parameters, JoinGroupOutputBoundary outputBoundary);

    Group getGroup(String id);
}
