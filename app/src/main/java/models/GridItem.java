package models;

import android.app.Activity;

import java.util.List;

public class GridItem {
    final String title;
    final List<ListItem> list;

    public GridItem(String title, List<ListItem> list) {
        this.title = title;
        this.list = list;
    }

    public String getTitle() {
        return title;
    }

    public List<ListItem> getList() {
        return list;
    }
}
