package OutputBoundary;


public interface CreateGroupOutputBoundary {
    /**
     * @param success create status.
     */
    void SetCreateStatus(boolean success);

    /**
     * @return create group message.
     */
    String presentOutput();
}