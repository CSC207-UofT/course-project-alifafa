package OutputBoundary.User.LogIn_LogOut;


public interface LogInOutputBoundary {
    /**
     * @param loggedIn log in status
     */
    void setLogInStatus(boolean loggedIn);

    /**
     * @return log out message.
     */
    String presentOutput();
}
