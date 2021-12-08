package Entity.Chat.PtoG;

import Entity.GroupChat.Group;
import Entity.GroupChat.GroupList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import org.junit.After;

import java.util.ArrayList;

/**
 * UserList Tester.
 *
 * @author <Authors name>
 * @since <pre>Nov 9, 2021</pre>
 * @version 1.0
 */

public class GroupListTest {
    @Before
    public void before() {
    }

    @After
    public void after() {
    }

    /**
     *
     * Method: addGroup() which only add a single group per time.
     *
     */
    @Test
    public void testAddGroup() {
        GroupList lst = new GroupList();
        lst.getAllGroups().clear();
        Group group = new Group("lpl");
        lst.addGroup(group);
        Assert.assertEquals(group, lst.getAllGroups().get(0));
    }

    /**
     *
     * Method: addGroups() which adds a list of groups.
     *
     */
    @Test
    public void testAddGroups() {
        GroupList lst = new GroupList();
        lst.getAllGroups().clear();
        Group group = new Group("lpl");
        Group group2 = new Group("lck");
        ArrayList<Group> groups = new ArrayList<>();
        groups.add(group);
        groups.add(group2);
        lst.addGroups(groups);
        Assert.assertEquals(group, lst.getAllGroups().get(0));
        Assert.assertEquals(group2, lst.getAllGroups().get(1));
    }

    /**
     *
     * Method: getAllGroups()
     *
     */
    @Test
    public void testGetAllGroups() {
        GroupList lst = new GroupList();
        lst.getAllGroups().clear();
        Group group = new Group("lpl");
        lst.addGroup(group);
        ArrayList<Group> check = new ArrayList<>();
        check.add(group);
        ArrayList<Group> check2 = lst.getAllGroups();
        Assert.assertEquals(check, check2);
    }


}