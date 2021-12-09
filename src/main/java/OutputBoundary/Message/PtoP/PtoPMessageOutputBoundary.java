package OutputBoundary.Message.PtoP;

public interface PtoPMessageOutputBoundary {

    /**
     * Store the P-to-p message history to presenter's attribute.
     *
     * @param s the P-to-p message history.
     */
    void store(String s);

    /**
     * Present the P-to-P message.
     */
    void present();

}
