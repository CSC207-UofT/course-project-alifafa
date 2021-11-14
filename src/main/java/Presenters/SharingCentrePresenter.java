package Presenters;

import Entity.ParagraphPost;
import OutputBoundary.SharingCentreOutputBoundary;

import java.util.List;

public class SharingCentrePresenter implements SharingCentreOutputBoundary {
    List<ParagraphPost> content;

    @Override
    public void setContent(List<ParagraphPost> content) {
        this.content = content;
    }

    @Override
    public String presentOutput() {
        return null;
    }
}
