package Presenters;

import Entity.Notifications;
import Entity.ParagraphPost;
import OutputBoundary.SharingCentreOutputBoundary;

import java.util.List;

public class SharingCentrePresenter<T> implements SharingCentreOutputBoundary {
    boolean isPost;
    List<T> content;

    @Override
    public void setIsPost(boolean isPost) {

    }

    @Override
    public String presentOutput() {
        return null;
    }
}
