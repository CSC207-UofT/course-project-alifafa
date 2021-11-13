package InputBoundary;

import Entity.User;
import Entity.Group;
import OutputBoundary.*;

import java.util.ArrayList;

public interface GroupInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UserManager.
     * Controller knows nothing about the UserManager but it can use InputBoundary instead.
     */

    public void runCreateGroup (String[] parameters, CreateGroupOutputBoundary outputBoundary);

    public void runJoinGroup(String[] parameters, JoinGroupOutputBoundary outputBoundary);

    public Group getGroup (String id);
}