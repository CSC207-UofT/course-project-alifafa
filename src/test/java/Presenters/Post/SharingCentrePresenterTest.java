package Presenters.Post;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class SharingCentrePresenterTest {

    SharingCentrePresenter sharingCentrePresenter = new SharingCentrePresenter();
    @Test
    void setContent() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("hi");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        sharingCentrePresenter.setContent(lst);
        assertEquals(lst, sharingCentrePresenter.presentOutput());
    }

    @Test
    void presentOutput() {
        ArrayList<String> lst = new ArrayList<>();
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        lst.add("123");
        sharingCentrePresenter.setContent(lst);
        assertEquals(lst, sharingCentrePresenter.presentOutput());
    }
}