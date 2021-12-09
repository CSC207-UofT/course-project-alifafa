package Presenters.Post;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NotificationPresenterTest {

    @Test
    void setContent() {
        NotificationPresenter presenter = new NotificationPresenter();
        List<String> list = new ArrayList<>();
        list.add("sdasd");
        presenter.setContent(list);
        assertEquals(1, presenter.content.size());
    }

    @Test
    void presentOutput() {
        NotificationPresenter presenter = new NotificationPresenter();
        List<String> list = new ArrayList<>();
        list.add("sdasd");
        presenter.setContent(list);
        assertEquals(1, presenter.presentOutput().size());
    }
}