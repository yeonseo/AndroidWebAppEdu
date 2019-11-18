package com.example.a14customlistviewtest3;

class MyData {
    int imgID;
    String txt1, txt2;

    public MyData(int imgID, String txt1, String txt2) {
        this.imgID = imgID;
        this.txt1 = txt1;
        this.txt2 = txt2;
    }

    public int getImgID() {
        return imgID;
    }

    public String getTxt1() {
        return txt1;
    }

    public String getTxt2() {
        return txt2;
    }

    public void setImgID(int imgID) {
        this.imgID = imgID;
    }

    public void setTxt1(String txt1) {
        this.txt1 = txt1;
    }

    public void setTxt2(String txt2) {
        this.txt2 = txt2;
    }
}
