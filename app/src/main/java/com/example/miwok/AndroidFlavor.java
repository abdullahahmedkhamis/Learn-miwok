package com.example.miwok;

public class AndroidFlavor {
    private String mVersionName;
    private String mVersionNumber;
    private int mImageResourceId;

    public AndroidFlavor(String mVersionName, String mVersionNumber, int mImageResourceId) {
        this.mVersionName = mVersionName;
        this.mVersionNumber = mVersionNumber;
        this.mImageResourceId = mImageResourceId;


    }

    public String getmVersionName() {
        return mVersionName;
    }

    public void setmVersionName(String mVersionName) {
        this.mVersionName = mVersionName;
    }

    public String getmVersionNumber() {
        return mVersionNumber;
    }

    public void setmVersionNumber(String mVersionNumber) {
        this.mVersionNumber = mVersionNumber;
    }

    public int getmImageResourceId() {
        return mImageResourceId;
    }

    public void setmImageResourceId(int mImageResourceId) {
        this.mImageResourceId = mImageResourceId;
    }
}
