package OutputBoundary.User.LogIn_LogOut;

public interface LogOutOutputBoundary {
    /**
     * @param loggedIn log in status.
     */
    void setLogInStatus(boolean loggedIn);

    /**
     * @return log in message.
     */
    String presentOutput();


}
