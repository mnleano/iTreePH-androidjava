package com.pwu.itree.activity;

public class Tree {

    int id;
    String commonName;
    String scientificName;
    String description;
    int drawable;


    String name;

    public Tree(int drawable, String name) {
        this.drawable = drawable;
        this.name = name;
    }

    public int getDrawable() {
        return drawable;
    }

    public String getName() {
        return name;
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
}
