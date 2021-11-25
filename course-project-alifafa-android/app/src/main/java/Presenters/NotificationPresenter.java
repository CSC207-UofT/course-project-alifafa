package Presenters;

import Entity.Notifications;
import Entity.ParagraphPost;
import OutputBoundary.NotificationOutputBoundary;
import OutputBoundary.SharingCentreOutputBoundary;

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
