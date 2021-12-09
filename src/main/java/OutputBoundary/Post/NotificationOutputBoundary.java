package OutputBoundary.Post;

import java.util.List;

public interface NotificationOutputBoundary {
    /**
     * @param notifications list of notifications.
     */
    void setContent(List<String> notifications);

    /**
     * @return null.
     */
    List<String> presentOutput();
}
