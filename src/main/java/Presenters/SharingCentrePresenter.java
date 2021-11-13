package Presenters;

import Entity.Notifications;
import Entity.ParagraphPost;
import OutputBoundary.SharingCentreOutputBoundary;

import java.util.List;

public class SharingCentrePresenter<T> implements SharingCentreOutputBoundary {
    List<ParagraphPost> content;

    @Override
    public void setContent(List<ParagraphPost> content) {

    }

    @Override
    public String presentOutput() {
        return null;
    }
}
