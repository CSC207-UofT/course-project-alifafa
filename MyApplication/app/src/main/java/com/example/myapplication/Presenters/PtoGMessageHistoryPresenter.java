package com.example.myapplication.Presenters;

import com.example.myapplication.OutputBoundary.PtoGMessageOutputBoundary;

import java.util.Objects;

public class PtoGMessageHistoryPresenter implements PtoGMessageOutputBoundary {

    //The PtoG message history.
    private String PtoGMessageHistory;

    public PtoGMessageHistoryPresenter(){this.PtoGMessageHistory = "";}

    @Override
    public void store(String s) {
        PtoGMessageHistory = s;
    }

    @Override
    public void present() {
        if (Objects.equals(PtoGMessageHistory, "")){
            System.out.println("No previous group chat history");
        }else{
            System.out.println(PtoGMessageHistory);
        }
    }
}

