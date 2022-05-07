package com.example.project_kayk.HelperClasses.HomeAdapter;

import android.widget.RelativeLayout;

public class TopHelperClass {
    int image;
    String title;


    public TopHelperClass(int image, String title ) {
        this.image = image;
        this.title = title;
    }

    public int getImage() {
        return image;
    }

    public String getTitle() {
        return title;
    }
}
