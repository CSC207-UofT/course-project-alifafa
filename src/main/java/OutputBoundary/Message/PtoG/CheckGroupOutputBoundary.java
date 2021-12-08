package OutputBoundary.Message.PtoG;

public interface CheckGroupOutputBoundary {
    /**
     * @param inGroup in group status.
     */
    void setCheckGroupStatus(boolean inGroup);

    /**
     * @return check group message.
     */
    String presentOutput();
}
