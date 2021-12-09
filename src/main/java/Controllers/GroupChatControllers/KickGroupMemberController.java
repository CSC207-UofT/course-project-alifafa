package Controllers.GroupChatControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.Message.KickGroupMemberPresenter;
import UseCase.GroupManager;

public class KickGroupMemberController {

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final GroupInputBoundary KickGroupMemberInputBoundary = new GroupManager();

    public void kickGroupMember(String[] parameters, KickGroupMemberPresenter presenter) {
        KickGroupMemberInputBoundary.runKickGroupMember(parameters, presenter);
    }


}