package com.example.project_kayk;

import java.util.List;

public class DataModel {

    private List<String> nestedList;
    private String itemText;
    //  private int imageView;
    private boolean isExpandable;

    public DataModel(List<String> itemList, String itemText) {
        this.nestedList = itemList;
        this.itemText = itemText;
        //this.imageView = imageView;
        isExpandable = false;
    }

    public void setExpandable(boolean expandable) {
        isExpandable = expandable;
    }

    public List<String> getNestedList() {
        return nestedList;
    }

    public String getItemText() {
        return itemText;
    }

    public boolean isExpandable() {
        return isExpandable;
    }
}
