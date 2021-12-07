
package Presenters;

import Presenters.Message.PtoPMessageHistoryPresenter;
import org.junit.jupiter.api.Test;


class PtoPMessageHistoryPresenterTest {

    // Check whether this presenter can store a text successfully
    @Test
    void store() {
        PtoPMessageHistoryPresenter ptoPMessageHistoryPresenter = new PtoPMessageHistoryPresenter();
        ptoPMessageHistoryPresenter.store("hi");
    }
}