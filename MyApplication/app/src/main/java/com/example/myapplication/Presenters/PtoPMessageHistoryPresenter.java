package com.example.myapplication.Presenters;

import com.example.myapplication.OutputBoundary.PtoPMessageOutputBoundary;

import java.util.Objects;

public class PtoPMessageHistoryPresenter implements PtoPMessageOutputBoundary {

    //The ptop message history.
    private String ptoPMessageHistory;

    public PtoPMessageHistoryPresenter(){this.ptoPMessageHistory = "";}

    @Override
    public void store(String s) {
        ptoPMessageHistory = s;
    }

    @Override
    public String present() {
        if (Objects.equals(ptoPMessageHistory, "")){
            return "No previous chat history";
        }else{
            return ptoPMessageHistory;
        }
    }
}