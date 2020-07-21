package com.example.appround_2;

import android.widget.Button;

public class ModelClass {
    private int imageResource;
    private String title;
    private String title2;
    private String title3;
    private String body;
    private Button button;

    public ModelClass(int imageResource,String second,String title,String title3,String title2,String body) {
        this.imageResource = imageResource;
        this.title=title;
        this.title2=title2;
        this.title3=title3;
        this.body=body;
        this.button=button;
    }

    public int getImageResource() {
        return imageResource;
    }

    public String getTitle() {
        return title;
    }

    public String getTitle2() {
        return title2;
    }

    public String getTitle3() {
        return title3;
    }

    public String getBody() {
        return body;
    }

    public Button getButton() {
        return button;
    }
}
