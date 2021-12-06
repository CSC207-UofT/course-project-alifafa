package com.example.myapplication.UseCase;


import com.example.myapplication.DataAccessInterface.DataAccess;
import com.example.myapplication.Entity.*;
import com.example.myapplication.Gateway.GroupDataGateway;
import com.example.myapplication.InputBoundary.GroupInputBoundary;
import com.example.myapplication.OutputBoundary.CreateGroupOutputBoundary;
import com.example.myapplication.OutputBoundary.JoinGroupOutputBoundary;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class GroupManager implements GroupInputBoundary{


    private final DataAccess gateway = new GroupDataGateway();

    public void readGroupData() throws IOException, ClassNotFoundException {
        //Read data from file and cast it to right class.
        boolean b = false;
        try (BufferedReader br = new BufferedReader(new FileReader("Group_Info.csv"))) {
            String line = br.readLine();
            if (line != null) {
                b = true;
            }
        }
        if (b) {
            GroupList store = new GroupList();
            ArrayList<Group> lst = this.gateway.readFromFile("Group_Info.csv");
            store.addGroups(lst);
        }
    }

    public void writeGroupData (DataAccess dataAccess) throws IOException {
        //Write data to file
        GroupList store = new GroupList();
        dataAccess.saveToFile("Group_Info.csv", store.getAllGroups());
    }

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


    public void createGroup(String id, String groupName) throws IOException {
        //Create a group
        GroupList group = new GroupList();
        Group g = new Group(id, groupName);
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

    public void joinGroup (String Userid, String GroupID){
        //Join a user with Userid to an existing group with GroupID
        Group group = this.getGroup(GroupID);
        ArrayList<User> members = group.getMembers();
        User u = new UserManager().getUser(Userid);
        if (!members.contains(u)) {
            group.addMember(u);
        }
    }


    public Group getGroup(String name) {
        //Return group by given Name
        GroupList store = new GroupList();
        ArrayList<Group> stored = store.getAllGroups();
        for (Group group : stored) {
            if (group.getGroupName().equals(name)) {
                return group;
            }
        }
        return null;
    }

    /**
     * Kick a user out of the group
     * @param group The group.
     * @param user The user that will be kicked.
     */
    public void kickGroupMember(Group group, User user){
        group.getMembers().remove(user);
    }



    @Override
    public void runCreateGroup(String[] parameters, CreateGroupOutputBoundary outputBoundary) throws IOException{
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
