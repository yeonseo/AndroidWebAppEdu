package com.example.a14customlistviewtest;

import android.widget.BaseAdapter;

import java.util.ArrayList;

public class MyData {
    int imgID;
    String txtName;
    String txtContent;

    public MyData(int imgID, String txtName, String txtContent) {
        this.imgID = imgID;
        this.txtName = txtName;
        this.txtContent = txtContent;
    }

    public int getImgID() {
        return imgID;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtContent() {
        return txtContent;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }
}
