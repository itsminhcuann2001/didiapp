package model;

import java.sql.Date;

public class User {

    private int mID;
    private String mName;
    private String mDate;
    private String mAddress;
    private String mPhoneNumber;

    public User(String mName, String mDate, String mAddress, String mPhoneNumber) {
        this.mName = mName;
        this.mDate = mDate;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
    }

    public User(int mID, String mName, String mDate, String mAddress, String mPhoneNumber) {
        this.mID = mID;
        this.mName = mName;
        this.mDate = mDate;
        this.mAddress = mAddress;
        this.mPhoneNumber = mPhoneNumber;
    }

    public int getmID() {
        return mID;
    }

    public void setmID(int mID) {
        this.mID = mID;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmDate() {
        return mDate;
    }

    public void setmDate(String mDate) {
        this.mDate = mDate;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }

    public String getmPhoneNumber() {
        return mPhoneNumber;
    }

    public void setmPhoneNumber(String mPhoneNumber) {
        this.mPhoneNumber = mPhoneNumber;
    }
}
