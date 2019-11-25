package com.omr.ism.class_objects;

import java.util.Date;
import java.util.UUID;

public class Sponsorship
{
    private UUID mId;
    private String mTitle;
    private Date mStartDate;
    private Date mEndDate;
    private boolean mActive;

    public Sponsorship()
    {
        mId = UUID.randomUUID();
        mStartDate = new Date();
        mEndDate = mStartDate;
    }

    public UUID getId() {
        return mId;
    }

    public void setId(UUID mId) {
        this.mId = mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Date getStartDate() {
        return mStartDate;
    }

    public void setStartDate(Date mStartDate) {
        this.mStartDate = mStartDate;
    }

    public Date getEndDate() {
        return mEndDate;
    }

    public void setEndDate(Date mEndDate) {
        this.mEndDate = mEndDate;
    }

    public boolean ismActive() {
        return mActive;
    }

    public void setmActive(boolean mActive) {
        this.mActive = mActive;
    }
}
