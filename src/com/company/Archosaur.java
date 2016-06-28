package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Archosaur extends Reptile{
    private boolean mIsExtinct;
    private boolean mIsWarmBlooded;
    private boolean mHasFeathers;

    private static final String archosaur = "\n    |------They are also an Archosaur which ";
    private static final String extinct = "is extinct ";
    private static final String notExtinct = "is not extinct ";
    private static final String warmBlood = "is warm blooded ";
    private static final String coldBlood = "is cold blooded ";
    private static final String feathers = "and has feathers!";
    private static final String noFeathers = "and has no feathers!";

    public Archosaur(String name, boolean isExtinct, boolean isWarmBlooded, boolean hasFeathers) {
        super(name);
        mIsExtinct = isExtinct;
        mIsWarmBlooded = isWarmBlooded;
        mHasFeathers = hasFeathers;
    }

    public boolean isExtinct() {
        return mIsExtinct;
    }

    public void setExtinct(boolean extinct) {
        mIsExtinct = extinct;
    }

    public boolean isWarmBlooded() {
        return mIsWarmBlooded;
    }

    public boolean isHasFeathers() {
        return mHasFeathers;
    }

    @Override
    public String toString() {
        String returnString = archosaur;

        if(mIsExtinct) returnString += extinct;
        else returnString += notExtinct;

        if(mIsWarmBlooded) returnString += warmBlood;
        else returnString += coldBlood;

        if(mHasFeathers) returnString += feathers;
        else returnString += noFeathers;

        return super.toString() + returnString;
    }
}
