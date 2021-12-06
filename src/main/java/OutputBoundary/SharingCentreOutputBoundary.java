package OutputBoundary;

import java.util.List;

public interface SharingCentreOutputBoundary {

    void setContent(List<String> content);

    List<String> presentOutput();
}
