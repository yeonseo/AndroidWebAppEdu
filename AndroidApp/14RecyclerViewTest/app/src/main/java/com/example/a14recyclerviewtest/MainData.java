package com.example.a14recyclerviewtest;

public class MainData {

    private int imgProfile;
    private String txtName;
    private String txtContent;

    public MainData(int imgProfile, String txtName, String txtContent) {
        this.imgProfile = imgProfile;
        this.txtName = txtName;
        this.txtContent = txtContent;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtContent() {
        return txtContent;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public void setTxtContent(String txtContent) {
        this.txtContent = txtContent;
    }
}
