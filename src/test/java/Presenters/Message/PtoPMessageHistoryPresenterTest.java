package Presenters.Message;

import org.junit.jupiter.api.Test;


class PtoPMessageHistoryPresenterTest {

    @Test
        // Check whether this presenter can store a text successfully
        public void store() {
            PtoPMessageHistoryPresenter ptoPMessageHistoryPresenter = new PtoPMessageHistoryPresenter();
            ptoPMessageHistoryPresenter.store("hi");

    }
}