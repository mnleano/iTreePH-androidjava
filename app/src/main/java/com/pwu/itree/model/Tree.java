package com.pwu.itree.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Tree implements Parcelable {

    private int id;
    private String commonName;
    private String scientificName;
    private String description;
    private String habitat;
    private String cultivationDetails;
    private String otherUsage;
    private int drawable;

    public Tree(int id, String scientificName, int drawable) {
        this.id = id;
        this.scientificName = scientificName;
        this.drawable = drawable;
    }

    public Tree(int id, String commonName, String scientificName, int drawable) {
        this.id = id;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.drawable = drawable;
    }

    public Tree(int id, String commonName, String scientificName, String description, int drawable) {
        this.id = id;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.description = description;
        this.drawable = drawable;

    }

    public Tree(int id, String commonName, String scientificName, String description,
                String habitat, String cultivationDetails, String otherUsage, int drawable) {
        this.id = id;
        this.commonName = commonName;
        this.scientificName = scientificName;
        this.description = description;
        this.habitat = habitat;
        this.cultivationDetails = cultivationDetails;
        this.otherUsage = otherUsage;
        this.drawable = drawable;
    }

    protected Tree(Parcel in) {
        id = in.readInt();
        commonName = in.readString();
        scientificName = in.readString();
        description = in.readString();
        habitat = in.readString();
        cultivationDetails = in.readString();
        otherUsage = in.readString();
        drawable = in.readInt();
    }

    public static final Creator<Tree> CREATOR = new Creator<Tree>() {
        @Override
        public Tree createFromParcel(Parcel in) {
            return new Tree(in);
        }

        @Override
        public Tree[] newArray(int size) {
            return new Tree[size];
        }
    };

    public int getId() {
        return id;
    }

    public String getCommonName() {
        return commonName;
    }

    public String getScientificName() {
        return scientificName;
    }

    public String getDescription() {
        return description;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getCultivationDetails() {
        return cultivationDetails;
    }

    public String getOtherUsage() {
        return otherUsage;
    }

    public int getDrawable() {
        return drawable;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(id);
        parcel.writeString(commonName);
        parcel.writeString(scientificName);
        parcel.writeString(description);
        parcel.writeString(habitat);
        parcel.writeString(cultivationDetails);
        parcel.writeString(otherUsage);
        parcel.writeInt(drawable);
    }
}
