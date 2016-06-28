package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Reptile extends Animal{
    private boolean mHasShell;
    private boolean mIsPoisonous;

    public Reptile(String name, int numLegs, boolean hasShell, boolean isPoisonous) {
        super(name, numLegs);
        mHasShell = hasShell;
        mIsPoisonous = isPoisonous;
    }

    public Reptile(String name) {
        super(name);
    }

    public boolean hasShell() {
        return mHasShell;
    }

    public boolean isPoisonous() {
        return mIsPoisonous;
    }

    public void setPoisonous(boolean poisonous) {
        mIsPoisonous = poisonous;
    }

    @Override
    public String toString() {
        String returnString = "\n" + "|--- is a Reptile ";

        if(mHasShell) returnString = returnString + "with a shell ";
        else returnString = returnString + "without a shell ";

        if(mIsPoisonous) returnString = returnString + "and is poisonous.";
        else returnString = returnString + "and is not poisonous.";

        return super.toString() + returnString;
    }
}
