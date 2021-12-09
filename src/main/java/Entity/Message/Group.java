package Entity.Message;

import Entity.Post.SharingCentre;
import Entity.Users.User;

import java.io.Serializable;
import java.util.ArrayList;

public class Group implements Serializable {
    //    private final String GroupID;
    private final String GroupName;
    private final ArrayList<User> members;
    private final ArrayList<PtoGMessage> PtoGMessageHistory;

    public Group(String name) {

        this.GroupName = name;
        this.members = new ArrayList<>();
        this.PtoGMessageHistory = new ArrayList<>();
    }

    public Group() {
        this.GroupName = "";
        this.members = new ArrayList<>();
        this.PtoGMessageHistory = new ArrayList<>();
    }


    // get group's name
    public String getGroupName() {
        return this.GroupName;
    }
    // get members from the group
    public ArrayList<User> getMembers() {
        return this.members;
    }
    // add a member to group
    public void addMember(User member) {
        //Add users to the list of users in this group
        this.members.add(member);
    }
    // add group message to group
    public void addGroupMessage(PtoGMessage message) {
        PtoGMessageHistory.add(message);
    }
    // get message from the group
    public ArrayList<PtoGMessage> getMessage() {
        return this.PtoGMessageHistory;
    }

    public void kickGroupMember(User user) {
        this.members.remove(user);
    }
}