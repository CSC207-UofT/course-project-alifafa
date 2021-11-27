package com.example.myapplication.OutputBoundary;

import com.example.myapplication.Entity.ParagraphPost;

import java.util.List;

public interface SharingCentreOutputBoundary {

    void setContent(List<ParagraphPost> content);

    String presentOutput();
}
