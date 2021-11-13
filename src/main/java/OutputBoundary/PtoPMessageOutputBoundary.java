package OutputBoundary;

public interface PtoPMessageOutputBoundary {

    /**
     * Store the ptop message history to presenter's attribute.
     * @param s the ptop message history.
     */
    void store(String s);

    /**
     * Present the  ptop message.
     */
    void present();

}
