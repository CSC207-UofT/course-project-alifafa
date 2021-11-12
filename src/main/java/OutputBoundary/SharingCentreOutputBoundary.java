package OutputBoundary;

public interface SharingCentreOutputBoundary {
    boolean posted = false;
    boolean deleted = false;
    boolean commented = false;

    void setPostStatus(boolean posted);

    void setDeleteStatus(boolean deleted);

    void setCommentedStatus(boolean commented);
}
