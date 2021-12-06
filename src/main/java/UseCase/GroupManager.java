package UseCase;
import DataAccessInterface.DataAccess;
import Entity.*;
import Entity.Group;
import Gateway.DataAccessGateway;
import InputBoundary.GroupInputBoundary;
import OutputBoundary.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class GroupManager implements GroupInputBoundary {

    private final DataAccess gateway = new DataAccessGateway();

    public void readGroupData() throws IOException, ClassNotFoundException {
        //Read data from file and cast it to right class.
        boolean readable = false;
        try (BufferedReader br = new BufferedReader(new FileReader("Group_Info.csv"))) {
            String line = br.readLine();
            if (line != null) {
                readable = true;
            }
        }
        if (readable) {
            GroupList store = new GroupList();
            HashMap<String, ArrayList<Group>> saved = this.gateway.readFromFile("Group_Info.csv");
            ArrayList<Group> storage = saved.get("storage");
//            for (Group g: storage) {
//                ArrayList<User> m = g.getMembers();
//                for (User u: m){
//                    g.addMember(u);
//                }
//            }
            store.addGroups(storage);
        }
    }

    public void writeGroupData (DataAccess dataAccess) throws IOException {
        //Write data to file
        GroupList store = new GroupList();
        ArrayList<Group> lst = store.getAllGroups();
        HashMap<String, ArrayList<Group>> s = new HashMap<>();
        s.put("storage", lst);
//        for (Group g: lst) {
//            s.put(g.getGroupName(), g.getMembers());
//        }
        dataAccess.saveToFile("Group_Info.csv", s);
    }



    public boolean checkGroupName(String name) {
        //Check whether the id existed in GroupList or not
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupName().equals(name)) {
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


    public void createGroup(String groupName) throws IOException {
        //Create a group
        GroupList group = new GroupList();
        Group g = new Group(groupName);
        group.addGroup(g);
        this.writeGroupData(this.gateway);
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

    public void joinGroup(String UserName, String GroupName) throws IOException {
        //Join a user with Userid to an existing group with GroupID
        Group group = this.getGroup(GroupName);
        ArrayList<User> members = group.getMembers();
        User u = new UserManager().getUser(UserName);
        if (!members.contains(u)) {
            group.addMember(u);
        }
        this.writeGroupData(this.gateway);
    }


    public Group getGroup(String name) {
        //Return group by given group name
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupName().equals(name)) {
                return group;
            }
        }
        return null;
    }

    @Override
    public void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) throws IOException {
        if (this.checkGroupName(parameters[0])) {
            this.createGroup(parameters[0]);
            outputBoundary.SetCreateStatus(true);
        } else {
            outputBoundary.SetCreateStatus(false);
        }
    }

    @Override
    public void runJoinGroup(String[] userInput, JoinGroupOutputBoundary outputBoundary) throws IOException {
        if (this.checkGroup(userInput[0], userInput[1])) {
            outputBoundary.setJoinGroupStatus("already in group");
        }
        else {
            joinGroup(userInput[0], userInput[1]);
            outputBoundary.setJoinGroupName(userInput[1]);
        }
    }

    public boolean checkGroup(String username, String GroupName) {
        Group group = this.getGroup(GroupName);
        ArrayList<User> members = group.getMembers();
        for (User i : members) {
            if (i.getUserName().equals(username)) {
                return true;
            }
        }
        return false;
    }




    public void runCheckGroup(String user, String group, CheckGroupOutputBoundary outputBoundary) {
        if (checkGroup(user, group)) {
            outputBoundary.setCheckGroupStatus(true);
            System.out.println("In group");
        } else {
            outputBoundary.setCheckGroupStatus(false);
            System.out.println("Not in group");
        }


    }

    public void kickGroupMember (String groupName, String userName){
        Group group = this.getGroup(groupName);
        User user = new UserManager().getUser(userName);
        group.kickGroupMember(user);
    }

    @Override
    public void runKickGroupMember(String[] parameters, KickGroupMemberOutputBoundary outputBoundary) {
        this.kickGroupMember(parameters[0], parameters[1]);
        outputBoundary.setGroupName(parameters[0]);
        outputBoundary.setRemoveUsername(parameters[1]);
    }

}

