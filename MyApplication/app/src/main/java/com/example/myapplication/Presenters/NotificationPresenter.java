package com.example.myapplication.Presenters;

import com.example.myapplication.Entity.Notifications;
import com.example.myapplication.OutputBoundary.NotificationOutputBoundary;

import java.util.List;

public class NotificationPresenter implements NotificationOutputBoundary {
    List<Notifications> content;

    @Override
    public void setContent(List<Notifications> content) {
        this.content = content;
    }

    @Override
    public String presentOutput() {
        return null;
    }
}

