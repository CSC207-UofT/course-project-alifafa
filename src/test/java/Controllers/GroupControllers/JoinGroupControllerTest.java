package Controllers.GroupControllers;


import Controllers.GroupChatControllers.JoinGroupController;
import Entity.Users.NullUser;
import Entity.Users.User;
import Presenters.Message.JoinGroupPresenter;
import UseCase.GroupManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;


class JoinGroupControllerTest {

    JoinGroupController controller;
    JoinGroupPresenter presenter;

    @BeforeEach
    void setUp() {
        controller = new JoinGroupController();
        presenter = new JoinGroupPresenter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void JoinGroup() throws IOException {

        String[] userInput = {"edg", "ig"};
        GroupManager manager = new GroupManager();
        manager.createGroup("ig");
        controller.joinGroup(userInput, presenter);

    }


}