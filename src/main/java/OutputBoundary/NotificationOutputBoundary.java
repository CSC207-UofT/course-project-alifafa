package OutputBoundary;

import Entity.Post.Notifications;

import java.util.List;

public interface NotificationOutputBoundary {
    void setContent(List<Notifications> notifications);

    String presentOutput();
}
