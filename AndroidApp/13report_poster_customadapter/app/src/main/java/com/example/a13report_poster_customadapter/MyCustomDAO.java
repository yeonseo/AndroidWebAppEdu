package com.example.a13report_poster_customadapter;

class MyCustomDAO {
    private String text1;
    private Integer image;

    public MyCustomDAO(String text1, Integer image) {
        this.image = image;
        this.text1 = text1;
    }

    public String getText1() {
        return text1;
    }


    public Integer getImage() {
        return image;
    }

    public void setText1(String text1) {
        this.text1 = text1;

    }

    public void setImage(Integer image) {
        this.image = image;
    }
}
