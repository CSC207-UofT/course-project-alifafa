package Controllers.UserControllers;

import InputBoundary.UserInputBoundary;
import Presenters.AddFriendPresenter;
import Presenters.BlockedListPresenter;
import UseCase.UserManager;

public class BlockedListController {
    /**
     * The input boundary for the blocked user use case.
     */
    private final UserInputBoundary BlockedListBoundary = new UserManager();

    public void addBlocked(String[] parameters, BlockedListPresenter presenter){
        BlockedListBoundary.runAddBlocked(parameters, presenter);
    }
}
