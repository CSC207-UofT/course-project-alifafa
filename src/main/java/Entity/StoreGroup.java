package Entity;

import java.util.ArrayList;

public class StoreGroup {
    private static ArrayList<Group> allGroups = new ArrayList<Group>();
    public void addGroup (Group group){
        allGroups.add(group);
    }
    public ArrayList<Group> getAllGroups(){
        return allGroups;
    }

}
