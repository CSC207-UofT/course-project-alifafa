package OutputBoundary;

import Entity.ParagraphPost;

import java.util.List;

public interface SharingCentreOutputBoundary {

    void setContent(List<ParagraphPost> content);

    String presentOutput();
}
