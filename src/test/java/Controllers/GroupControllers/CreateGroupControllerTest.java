package Controllers.GroupControllers;

import Controllers.GroupChatControllers.CreateGroupController;
import Presenters.Message.CreateGroupPresenter;
import UseCase.GroupManager;
import UseCase.UserManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class CreateGroupControllerTest {

    CreateGroupController controller;
    CreateGroupPresenter presenter;

    @BeforeEach
    void setUp() {
        controller = new CreateGroupController();
        presenter = new CreateGroupPresenter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void createGroup() throws IOException {
        String[] userInput = {"edg"};
        controller.createAGroup(userInput, presenter);
        GroupManager manager = new GroupManager();
        assertFalse(manager.checkGroupName("edg"));
    }


}