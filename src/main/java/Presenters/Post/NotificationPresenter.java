package Presenters.Post;

import Entity.Post.Notifications;
import OutputBoundary.Post.NotificationOutputBoundary;

import java.util.List;

public class NotificationPresenter implements NotificationOutputBoundary {
    List<String> content;

    @Override
    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public List<String> presentOutput() {
        return content;
    }
}
