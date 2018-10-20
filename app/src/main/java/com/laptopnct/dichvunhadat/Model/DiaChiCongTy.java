package com.laptopnct.dichvunhadat.Model;

import android.os.Parcel;
import android.os.Parcelable;

public class DiaChiCongTy {


    String diachi;
    double latitude,longitude;

    public DiaChiCongTy(){

    }


    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }




}
