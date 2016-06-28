package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Animal {
    private int mNumLegs;
    private double mTopSpeed;
    private boolean mIsEndangered;
    private String mName;

    public Animal(int numLegs, double topSpeed, boolean isEndangered, String name) {
        mNumLegs = numLegs;
        mTopSpeed = topSpeed;
        mIsEndangered = isEndangered;
        mName = name;
    }

    public Animal() {
        mNumLegs = 4;
        mTopSpeed = 10;
        mIsEndangered = false;
        mName = null;
    }

    public Animal(String name) {
        mName = name;
        mNumLegs = 4;
        mTopSpeed = 10;
        mIsEndangered = false;
    }

    public Animal(String name, int numLegs) {
        mName = name;
        mNumLegs = numLegs;
        mTopSpeed = 10;
        mIsEndangered = false;
    }

    public int getNumLegs() {
        return mNumLegs;
    }

    public void setNumLegs(int numLegs) {
        mNumLegs = numLegs;
    }

    public double getTopSpeed() {

        return mTopSpeed;
    }

    public void setTopSpeed(double topSpeed) {
        mTopSpeed = topSpeed;
    }

    public boolean isEndangered() {
        return mIsEndangered;
    }

    public void setEndangered(boolean endangered) {
        mIsEndangered = endangered;
    }

    public String getName() {
        return mName;
    }

    public void setName(String name) {
        mName = name;
    }

    @Override
    public String toString() {
        String returnString = mName + ":\n" + "Has " + mNumLegs + " legs, " + "a Top Speed of " + mTopSpeed + ", and ";

        if(mIsEndangered) returnString = returnString + "is endangered!";
        else returnString = returnString + "isn't endangered.";

        return returnString;
    }
}
