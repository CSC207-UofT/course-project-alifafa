package OutputBoundary.Message.PtoG;

public interface PtoGMessageOutputBoundary {


    /**
     * Store the PtoG message history to presenter's attribute.
     *
     * @param s the PtoG message history.
     */
    void store(String s);

    /**
     * Present the PtoG message.
     */
    void present();

}
