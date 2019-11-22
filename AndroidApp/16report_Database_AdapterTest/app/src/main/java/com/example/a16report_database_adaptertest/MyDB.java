package com.example.a16report_database_adaptertest;

class MyDB {
    private int imgProfile;
    private String txtName;
    private String txtNum;

    public MyDB(int imgProfile, String txtName, String txtNum) {
        this.imgProfile = imgProfile;
        this.txtName = txtName;
        this.txtNum = txtNum;
    }

    public int getImgProfile() {
        return imgProfile;
    }

    public String getTxtName() {
        return txtName;
    }

    public String getTxtNum() {
        return txtNum;
    }

    public void setImgProfile(int imgProfile) {
        this.imgProfile = imgProfile;
    }

    public void setTxtName(String txtName) {
        this.txtName = txtName;
    }

    public void setTxtNum(String txtNum) {
        this.txtNum = txtNum;
    }
}
