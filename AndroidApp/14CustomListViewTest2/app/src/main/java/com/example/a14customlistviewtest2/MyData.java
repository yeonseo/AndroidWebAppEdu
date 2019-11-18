package com.example.a14customlistviewtest2;

public class MyData {
    int imgID;
    String text1 , text2;

    public MyData(int imgID, String text1, String text2) {
        this.imgID = imgID;
        this.text1 = text1;
        this.text2 = text2;
    }

    public int getImgID() {
        return imgID;
    }

    public String getText1() {
        return text1;
    }

    public String getText2() {
        return text2;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setText1(String text1) {
        this.text1 = text1;
    }

    public void setText2(String text2) {
        this.text2 = text2;
    }
}
