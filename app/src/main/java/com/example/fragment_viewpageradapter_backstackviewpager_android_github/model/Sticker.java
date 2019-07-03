package com.example.fragment_viewpageradapter_backstackviewpager_android_github.model;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.UUID;

public class Sticker implements Parcelable {

    private String sticker_Id;
    private String sticker_Name;
    private String sticker_description;
    private String sticker_Image;
    private double sticker_Price;


    public Sticker() {
    }

    public Sticker(String sticker_Id, String sticker_Name,String sticker_Image,String sticker_description, double sticker_Price) {
        this.sticker_Id = sticker_Id;
        this.sticker_Name = sticker_Name;
        this.sticker_description = sticker_description;
        this.sticker_Image = sticker_Image;
        this.sticker_Price = sticker_Price;
    }

    public String getSticker_Id() {
        return sticker_Id;
    }

    public void setSticker_Id(String sticker_Id) {
        this.sticker_Id = sticker_Id;
    }

    public String getSticker_Name() {
        return sticker_Name;
    }

    public void setSticker_Name(String sticker_Name) {
        this.sticker_Name = sticker_Name;
    }

    public String getSticker_description() {
        return sticker_description;
    }

    public void setSticker_description(String sticker_description) {
        this.sticker_description = sticker_description;
    }

    public String getSticker_Image() {
        return sticker_Image;
    }

    public void setSticker_Image(String sticker_Image) {
        this.sticker_Image = sticker_Image;
    }

    public double getSticker_Price() {
        return sticker_Price;
    }

    public void setSticker_Price(double sticker_Price) {
        this.sticker_Price = sticker_Price;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.sticker_Id);
        dest.writeString(this.sticker_Name);
        dest.writeString(this.sticker_description);
        dest.writeString(this.sticker_Image);
        dest.writeDouble(this.sticker_Price);
    }

    protected Sticker(Parcel in) {
        this.sticker_Id = in.readString();
        this.sticker_Name = in.readString();
        this.sticker_description = in.readString();
        this.sticker_Image = in.readString();
        this.sticker_Price = in.readDouble();
    }

    public static final Parcelable.Creator<Sticker> CREATOR = new Parcelable.Creator<Sticker>() {
        @Override
        public Sticker createFromParcel(Parcel source) {
            return new Sticker(source);
        }

        @Override
        public Sticker[] newArray(int size) {
            return new Sticker[size];
        }
    };
}
