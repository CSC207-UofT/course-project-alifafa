package OutputBoundary;

import Entity.Post.Notifications;

import java.util.List;

public interface NotificationOutputBoundary {
    /**
     * @param notifications list of notifications.
     */
    void setContent(List<Notifications> notifications);

    /**
     * @return null.
     */
    String presentOutput();
}
