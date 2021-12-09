package Entity.GroupChat;

import java.io.Serializable;
import java.util.ArrayList;

public class GroupList implements Serializable {
    // a list store all groups
    private static final ArrayList<Group> allGroups = new ArrayList<>();
    // add a group to group list
    public void addGroup (Group group){
        allGroups.add(group);
    }
    // add groups to group list
    public void addGroups (ArrayList<Group> groups){
        allGroups.addAll(groups);
    }
   // get all groups from GroupList
    public ArrayList<Group> getAllGroups(){
        return allGroups;
    }

////    public void deleteAGroup (GroupList groups, Group group) {
//        groups.getAllGroups().remove(group);
//    }

}
