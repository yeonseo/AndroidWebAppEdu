package com.example.a20intentsendtest;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

class Data implements Serializable{
    private static final long serialVersionUID = 1L;
    private String name;
    private int code;

    public Data(int code, String name) {super();this.code = code;this.name = name;}

    public String getName() {return name;}

    public void setName(String name) {this.name = name;}

    public int getCode() {return code;}

    public void setCode(int code) {this.code = code;}

    @Override

    public String toString() {return "Subway [name=" + name + ", code=" + code + "]";}
}
