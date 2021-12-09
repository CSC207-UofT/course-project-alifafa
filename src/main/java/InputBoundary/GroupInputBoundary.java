package InputBoundary;

import Entity.Message.Group;
import OutputBoundary.Message.PtoG.CheckGroupOutputBoundary;
import OutputBoundary.Message.PtoG.CreateGroupOutputBoundary;
import OutputBoundary.Message.PtoG.JoinGroupOutputBoundary;
import OutputBoundary.Message.PtoG.KickGroupMemberOutputBoundary;

import java.io.IOException;

public interface GroupInputBoundary {

    // This InputBoundary interface must be implemented by the GroupManager.
    // Controller knows nothing about the GroupManager, but it can use InputBoundary instead.


    /**
     * @param parameters     The inputs for runCreateGroup
     * @param outputBoundary the outputBoundary for GroupInputBoundary
     * @throws IOException exception
     */
    void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) throws IOException;

    /**
     * @param parameters     The inputs for runJoinGroup
     * @param outputBoundary the outputBoundary for GroupInputBoundary
     * @throws IOException exception
     */
    void runJoinGroup(String[] parameters, JoinGroupOutputBoundary outputBoundary) throws IOException;

    /**
     * @param user           The user of runCheckGroup
     * @param group          The group of runCheckGroup
     * @param outputBoundary the outputBoundary for GroupInputBoundary
     */
    void runCheckGroup(String user, String group, CheckGroupOutputBoundary outputBoundary);

    /**
     * @param id the group id
     * @return return id
     */
    Group getGroup(String id);

    /**
     * @param parameters     The inputs for runKickGroupMember
     * @param outputBoundary the outputBoundary for GroupInputBoundary
     */
    void runKickGroupMember(String[] parameters, KickGroupMemberOutputBoundary outputBoundary);

}