package com.example.android.quakereport;

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private Long mDate;


    public Earthquake(double magnitude, String location, Long date){
        mMagnitude = magnitude;
        mLocation = location;
        mDate = date;
    }

    public double getMagnitude(){ return mMagnitude;}
    public String getLocation(){ return mLocation;}
    public Long getDate(){ return mDate;}
}
