package Controllers.GroupControllers;



import Controllers.GroupChatControllers.KickGroupMemberController;

import Presenters.Message.KickGroupMemberPresenter;
import UseCase.GroupManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;


class KickGroupControllerTest {

    KickGroupMemberController controller;
    KickGroupMemberPresenter presenter;

    @BeforeEach
    void setUp() {
        controller = new KickGroupMemberController();
        presenter = new KickGroupMemberPresenter();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void KickGroup() throws IOException {

        String[] userInput = {"edg", "ig"};
        GroupManager manager = new GroupManager();
        manager.createGroup("ig");
        manager.joinGroup("edg", "ig");
        controller.kickGroupMember(userInput, presenter);
    }


}