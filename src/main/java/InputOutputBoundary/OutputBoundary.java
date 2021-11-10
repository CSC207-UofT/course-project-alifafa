package InputOutputBoundary;

import java.util.ArrayList;

public interface OutputBoundary {
    /**
     * This OutputBoundary interface must be implemented by the Presenter.
     * Each Usecase will use this interface to send their output information.
     * Usecase needs to specify what method they need here.
     */

    // TODO: This is just a template. We may need different OutputBoundary subclasses for different
    // TODO: usecases. Example: UserOutputBoundary, PostOutputBoundary. Please create a subclass
    // interface if needed.

    ArrayList<String> output = new ArrayList<String>();
    public void storeOutput();
}
