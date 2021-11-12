package Entity;
import java.util.ArrayList;

public class Group {
    private final String GroupiD;
    private String GroupName;
    private ArrayList<User> members;
    private final ArrayList<PtoGMessage> PtoGMessageHistory;

    public Group(String id, String name) {
        this.GroupiD = id;
        this.GroupName = name;
        this.members = new ArrayList<>();
        this.PtoGMessageHistory = new ArrayList<>();
    }


    public String getGroupName() {
        return this.GroupName;
    }

    public ArrayList<User> getMembers() {
        return this.members;
    }

    public void addMember(User member) {
        //Add users to the list of users in this group
        this.members.add(member);
    }

    public void addGroupMessage(PtoGMessage message) {
        PtoGMessageHistory.add(message);
    }

    public ArrayList<PtoGMessage> getMessage() {
        return this.PtoGMessageHistory;
    }

    public String getGroupID() {
        return this.GroupiD;
    }

}