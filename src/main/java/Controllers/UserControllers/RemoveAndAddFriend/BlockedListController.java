package Controllers.UserControllers.RemoveAndAddFriend;

import InputBoundary.UserInputBoundary;
import Presenters.User.BlockedListPresenter;
import UseCase.UserManager;

import java.io.IOException;

public class BlockedListController {
    /**
     * The input boundary for the blocked user use case.
     */
    private final UserInputBoundary BlockedListBoundary = new UserManager();

    public void addBlocked(String[] parameters, BlockedListPresenter presenter) throws IOException {
        BlockedListBoundary.runAddBlocked(parameters, presenter);
    }

    public boolean checkBlocked(String[] parameters) {
        return BlockedListBoundary.runCheckBlocked(parameters);
    }
}
