package InputOutputBoundary;

import java.util.ArrayList;

public interface InputBoundary {
    /**
     * This InputBoundary interface must be implemented by the UseCase.
     * Controller knows nothing about the UseCase. However, as UseCase implements InputBoundary,
     *      the controller can use the InputBoundary to know what are the inputs that needed by
     *      the Usecase.


    // TODO: This is just a template. We may need different Inputboundary subclasses for different
    // TODO: usecases. Please create a subclass interface if needed.
     */

    public int getNumOfParametersNeeded();
    // This method return the number of inputs that the user needs to enter.
    // For example, if the user wants to send a message, then you need 2 pieces of information,
    //      which are friendID and a string of message. Hence getNumOfParameters will return 2.

    public ArrayList<String> getNameOfInputs();
    // This method return an array list of string, containing the type of information that the
    //      user needs to enter.
    // Example: If the user wants to log in, then we need three pieces of information, which are
    //      Username, userID, and passwords. Hence getNameOfInputs will return
    //      ["Username", "ID", "Password] for log in purposes.
}