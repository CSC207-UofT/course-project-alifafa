package Entity;

import java.util.ArrayList;

public class GroupList {
    private static final ArrayList<Group> allGroups = new ArrayList<>();
    public void addGroup (Group group){
        allGroups.add(group);
    }
    public ArrayList<Group> getAllGroups(){
        return allGroups;
    }

}
