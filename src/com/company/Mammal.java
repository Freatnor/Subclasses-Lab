package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Mammal extends Animal{
    private boolean mGivesLiveBirth;
    private boolean mHasHair;

    private static final String mammal = "\n|---- is a Mammal ";
    private static final String liveBrith = "which gives live birth";
    private static final String noLiveBrith = "which does not give live birth";
    private static final String hair = " and has hair.";
    private static final String noHair = " and has no hair!";

    public Mammal(String name, int numLegs, boolean givesLiveBirth, boolean hasHair) {
        super(name, numLegs);
        mGivesLiveBirth = givesLiveBirth;
        mHasHair = hasHair;
    }

    public Mammal(String name) {
        super(name);
        mGivesLiveBirth = true;
        mHasHair = true;
    }

    public boolean isGivesLiveBirth() {
        return mGivesLiveBirth;
    }

    public boolean isHasHair() {
        return mHasHair;
    }

    public void setHasHair(boolean hasHair) {
        mHasHair = hasHair;
    }

    @Override
    public String toString() {
        String returnString = mammal;

        if(mGivesLiveBirth) returnString += liveBrith;
        else returnString += noLiveBrith;

        if(mHasHair) returnString += hair;
        else returnString += noHair;

        return super.toString() + returnString;
    }
}
