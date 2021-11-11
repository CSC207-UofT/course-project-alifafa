package OutputBoundary;

import java.util.ArrayList;

public interface AccountRegistrationOutputBoundary {
    public void setRegistrationStatus(boolean success);
    public String presentOutput();
}