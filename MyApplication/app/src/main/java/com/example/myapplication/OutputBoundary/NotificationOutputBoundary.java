package com.example.myapplication.OutputBoundary;

//zpackage OutputBoundary;

import com.example.myapplication.Entity.Notifications;

import java.util.List;

public interface NotificationOutputBoundary {
    void setContent(List<Notifications> notifications);

    String presentOutput();
}