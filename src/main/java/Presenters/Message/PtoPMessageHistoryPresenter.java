package Presenters.Message;

import OutputBoundary.Message.PtoP.PtoPMessageOutputBoundary;

import java.util.Objects;

public class PtoPMessageHistoryPresenter implements PtoPMessageOutputBoundary {

    //The p-to-p message history.
    private String ptoPMessageHistory;

    public PtoPMessageHistoryPresenter() {
        this.ptoPMessageHistory = "";
    }

    @Override
    public void store(String s) {
        ptoPMessageHistory = s;
    }

    @Override
    public void present() {
        if (Objects.equals(ptoPMessageHistory, "")) {
            System.out.println("No previous chat history");
        } else {
            System.out.println(ptoPMessageHistory);
        }
    }
}
