package InputBoundary;

import Entity.Group;
import OutputBoundary.*;

import java.io.IOException;

public interface GroupInputBoundary {
    /**
     * This InputBoundary interface must be implemented by the GroupManager.
     * Controller knows nothing about the GroupManager but it can use InputBoundary instead.
     */

    void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) throws IOException;

    void runJoinGroup(String[] parameters, JoinGroupOutputBoundary outputBoundary) throws IOException;

    void runCheckGroup(String user, String group, CheckGroupOutputBoundary outputBoundary);

    Group getGroup(String id);

    void runKickGroupMember(String[] parameters, KickGroupMemberOutputBoundary outputBoundary);

}