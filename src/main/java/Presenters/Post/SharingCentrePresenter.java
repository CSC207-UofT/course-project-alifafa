package Presenters.Post;

import OutputBoundary.SharingCentreOutputBoundary;

import java.util.List;

public class SharingCentrePresenter implements SharingCentreOutputBoundary {
    List<String> content;

    @Override
    public void setContent(List<String> content) {
        this.content = content;
    }

    @Override
    public List<String> presentOutput() {
        return this.content;
    }
}
