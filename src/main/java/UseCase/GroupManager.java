package UseCase;
import Entity.*;
import Entity.Group;
import UseCases.UseCase;

import java.util.ArrayList;

public class GroupManager extends UseCase {

    public boolean checkGroupID(String id) {
        //Check whether the id existed in StoreGroup or not
        StoreGroup store = new StoreGroup();
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
        StoreGroup store = new StoreGroup();
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
        StoreGroup group = new StoreGroup();
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
        StoreGroup store = new StoreGroup();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupID().equals(id)) {
                return group;
            }
        }
        return null;
    }

}