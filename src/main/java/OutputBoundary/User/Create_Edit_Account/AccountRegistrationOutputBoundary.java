package OutputBoundary.User.Create_Edit_Account;

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