package OutputBoundary;

public interface EditPasswordOutputBoundary {
    /**
     * @param edited edit status.
     */
    void setEdited(boolean edited);

    /**
     * @return edit password message.
     */
    String presentOutput();
}
