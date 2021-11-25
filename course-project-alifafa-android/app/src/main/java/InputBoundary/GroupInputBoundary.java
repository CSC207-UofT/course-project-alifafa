package InputBoundary;

import Entity.Group;
import OutputBoundary.CreateGroupOutputBoundary;
import OutputBoundary.JoinGroupOutputBoundary;

public interface GroupInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the GroupManager.
     * Controller knows nothing about the GroupManager but it can use InputBoundary instead.
     */

    void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary);

    void runJoinGroup(String[] parameters, JoinGroupOutputBoundary outputBoundary);

    Group getGroup(String id);
}