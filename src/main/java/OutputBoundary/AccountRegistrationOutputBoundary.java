package OutputBoundary;

public interface AccountRegistrationOutputBoundary {
    void setRegistrationStatus(boolean success);
    String presentOutput();
}