package UseCase;
import Entity.*;
import Entity.Group;
import InputBoundary.GroupInputBoundary;
import OutputBoundary.CreateGroupOutputBoundary;
import OutputBoundary.JoinGroupOutputBoundary;

import java.util.ArrayList;

public class GroupManager implements GroupInputBoundary{

    public boolean checkGroupID(String id) {
        //Check whether the id existed in GroupList or not
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupID().equals(id)) {
                return false;
            }
        }

        return true;
    }


////    public boolean checkGroupName(String userName) {
//        //Check whether the group name existed in GroupList or not
//        GroupList store = new GroupList();
//        ArrayList<Group> stored = store.getAllGroups();
//        for (Group g : stored) {
//            if (group.getGroupName().equals(userName)) {
//                return false;
//            }
//        }
//        return true;
//    }


    public void createGroup(String id, String groupName) {
        //Create a group
        GroupList group = new GroupList();
        Group g = new Group(id, groupName);
        group.addGroup(g);
    }

////    public Group findGroup (String Userid, String GroupID){
//        //Find the group for a given user id and group id
//        Group g = this.getGroup(GroupID);
//        ArrayList<User> members = group.getMembers();
//        for (User i: members){
//            if (i.getID().equals(Userid)){
//                return group;
//            }
//        }
//        return null;
//    }

    public void joinGroup (String Userid, String GroupID){
        //Join a user with Userid to an existing group with GroupID
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

