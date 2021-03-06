package com.example.a17myplayerproject;

import android.graphics.Bitmap;

class MyDB {
    private String txtArtist;
    private String txtTitle;
    private long duration;
    private String txtAlbum;
    private long txtAlbumID;
    private String txtGenre;
    private String txtReleseDate;
    private long imgProfile;
    private Bitmap imgUri;
    private String filePath;

    public MyDB(String txtArtist, String txtTile) {
        this.txtArtist = txtArtist;
        this.txtTitle = txtTile;
    }

    public MyDB(String txtArtist, String txtTitle, long duration, String txtAlbum, String txtGenre, String txtReleseDate, Bitmap imgUri, String filePath) {
        this.txtArtist = txtArtist;
        this.txtTitle = txtTitle;
        this.duration = duration;
        this.txtAlbum = txtAlbum;
        this.txtGenre = txtGenre;
        this.txtReleseDate = txtReleseDate;
        this.imgUri = imgUri;
        this.filePath = filePath;
    }

    public MyDB(String txtArtist, String txtTitle, long duration, String txtAlbum, String txtGenre, String txtReleseDate, long imgProfile, String filePath) {
        this.txtArtist = txtArtist;
        this.txtTitle = txtTitle;
        this.duration = duration;
        this.txtAlbum = txtAlbum;
        this.txtGenre = txtGenre;
        this.txtReleseDate = txtReleseDate;
        this.imgProfile = imgProfile;
        this.filePath = filePath;
    }

    public MyDB(String txtArtist, String txtTitle, long duration, String txtAlbum, long txtAlbumID, String txtGenre, String txtReleseDate, String filePath) {
        this.txtArtist = txtArtist;
        this.txtTitle = txtTitle;
        this.duration = duration;
        this.txtAlbum = txtAlbum;
        this.txtAlbumID = txtAlbumID;
        this.txtGenre = txtGenre;
        this.txtReleseDate = txtReleseDate;
        this.filePath = filePath;
    }

    public long getTxtAlbumID() {
        return txtAlbumID;
    }

    public void setTxtAlbumID(long txtAlbumID) {
        this.txtAlbumID = txtAlbumID;
    }

    public Bitmap getImgUri() {
        return imgUri;
    }

    public void setImgUri(Bitmap imgUri) {
        this.imgUri = imgUri;
    }

    public String getTxtArtist() {
        return txtArtist;
    }

    public String getTxtTitle() {
        return txtTitle;
    }

    public long getDuration() {
        return duration;
    }

    public String getTxtAlbum() {
        return txtAlbum;
    }

    public String getTxtGenre() {
        return txtGenre;
    }

    public String getTxtReleseDate() {
        return txtReleseDate;
    }

    public long getImgProfile() {
        return imgProfile;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setTxtArtist(String txtArtist) {
        this.txtArtist = txtArtist;
    }

    public void setTxtTitle(String txtTitle) {
        this.txtTitle = txtTitle;
    }

    public void setDuration(long duration) {
        this.duration = duration;
    }

    public void setTxtAlbum(String txtAlbum) {
        this.txtAlbum = txtAlbum;
    }

    public void setTxtGenre(String txtGenre) {
        this.txtGenre = txtGenre;
    }

    public void setTxtReleseDate(String txtReleseDate) {
        this.txtReleseDate = txtReleseDate;
    }

    public void setImgProfile(long imgProfile) {
        this.imgProfile = imgProfile;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
