package OutputBoundary;

public interface AccountRegistrationOutputBoundary {
    /**
     * @param success registration status.
     */
    void setRegistrationStatus(boolean success);

    /**
     * @return registratio
     */
    String presentOutput();
}