package Presenters.Message;

import org.junit.jupiter.api.Test;


class PtoGMessagePresenterTest {

    @Test
    // Check whether this presenter can store a text successfully
    public void store() {
        PtoGMessageHistoryPresenter ptoGMessageHistoryPresenter = new PtoGMessageHistoryPresenter();
        ptoGMessageHistoryPresenter.store("haha");

    }
}