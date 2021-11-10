package Presenters;

import java.util.ArrayList;

public interface OutputBoundary {
    /**
     * This OutputBoundary interface must be implemented by the UseCase. Each presenter will have
     * access to this interface without knowing anything about the UseCase.
     * Presenter will use this interface to get output information.
     */

    // TODO: This is just a template. We may need different OutputBoundary subclasses for different
    // TODO: usecases. Example: UserOutputBoundary, PostOutputBoundary.

    ArrayList<String> output = new ArrayList<String>();
    public void setOutput();
    public void getOutput();
}
