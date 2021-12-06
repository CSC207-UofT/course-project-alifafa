package Controllers.UserControllers;

import InputBoundary.GroupInputBoundary;
import Presenters.KickGroupMemberPresenter;
import UseCase.GroupManager;

public class KickGroupMemberController{

    /**
     * The input boundary for the AccountRegistration use case.
     */
    private final GroupInputBoundary KickGroupMemberInputBoundary = new GroupManager();

    public void kickGroupMember(String[] parameters, KickGroupMemberPresenter presenter){
        KickGroupMemberInputBoundary.runKickGroupMember(parameters, presenter);
    }


}