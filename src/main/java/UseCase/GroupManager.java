package UseCase;
import Entity.*;
import Entity.Group;
import InputBoundary.GroupInputBoundary;
import InputBoundary.UserInputBoundary;
import OutputBoundary.AccountRegistrationOutputBoundary;
import OutputBoundary.AddFriendOutputBoundary;
import OutputBoundary.CreateGroupOutputBoundary;
import OutputBoundary.JoinGroupOutputBoundary;

import java.util.ArrayList;

public class GroupManager implements GroupInputBoundary{

    public boolean checkGroupID(String id) {
        //Check whether the id existed in StoreGroup or not
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupID().equals(id)) {
                return false;
            }
        }

        return true;
    }


    public boolean checkGroupName(String userName) {
        //Check whether the group name existed in StoreGroup or not
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupName().equals(userName)) {
                return false;
            }
        }
        return true;
    }


    public Group createGroup(String id, String groupName) {
        //Create a group
        GroupList group = new GroupList();
        ArrayList<Group> stored = group.getAllGroups();
        Group g = new Group(id, groupName);
        group.addGroup(g);
        return g;
    }

    public Group findGroup (String Userid, String GroupID){
        //Find the group for a given user id and group id
        Group group = this.getGroup(GroupID);
        ArrayList<User> members = group.getMembers();
        for (User i: members){
            if (i.getID().equals(Userid)){
                return group;
            }
        }
        return null;
    }

    public void joinGroup (String Userid, String GroupID){
        //Join a group by given Userid
        Group group = this.getGroup(GroupID);
        ArrayList<User> members = group.getMembers();
        User u = new UserManager().getUser(Userid);
        if (!members.contains(u)) {
            group.addMember(u);
        }
    }


    public Group getGroup(String id) {
        //Return group by given ID
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupID().equals(id)) {
                return group;
            }
        }
        return null;
    }

    @Override
    public void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) {
        if (this.checkGroupID(parameters[0])){
            this.createGroup(parameters[0], parameters[1]);
            outputBoundary.SetCreateStatus(true);
        } else{
            outputBoundary.SetCreateStatus(false);
        }
    }

    @Override
    public void runJoinGroup(String[] userInput, JoinGroupOutputBoundary outputBoundary) {
        joinGroup(userInput[0], userInput[1]);
        outputBoundary.setJoinGroupStatus(userInput[1]);
    }
}

