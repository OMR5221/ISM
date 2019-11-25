package com.omr.ism.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Sponsor
{
    private String mId;
    private List<String> mTypeTags;
    private String mName;
    private String mDescription;
    private String mImageContentUrl;

    public Sponsor()
    {
        this.mTypeTags = new ArrayList<>();
    }

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        this.mId = id;
    }

    public List<String> getTypeTags() {
        return mTypeTags;
    }

    public void setTypeTags(String typeTag) {
        this.mTypeTags.add(typeTag);
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        this.mName = name;
    }

    public String getDescription() {
        return mDescription;
    }

    public void setDescription(String description) {
        this.mDescription = description;
    }

    public String getImageContentUrl() {
        return mImageContentUrl;
    }

    public void setImageContentUrl(String imageContentUrl) {
        this.mImageContentUrl = imageContentUrl;
    }

    @Override
    public String toString() {
        return mName + ": " + mImageContentUrl;
    }
}
