package OutputBoundary.Post;

import java.util.List;

public interface SharingCentreOutputBoundary {

    /**
     * @param content the list of contents in sharing centre.
     */
    void setContent(List<String> content);

    /**
     * @return return the list of content in sharing centre.
     */
    List<String> presentOutput();
}
