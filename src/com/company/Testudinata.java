package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Testudinata extends Reptile {
    private boolean mIsAquatic;

    private static final String turtle = "\n    |------They are also a Turtle which ";
    private static final String aquatic = "which is aquatic!";
    private static final String notAquatic = "which is not aquatic!";
    public Testudinata(String name, boolean isAquatic) {
        super(name, 4, true, false);
        mIsAquatic = isAquatic;
    }

    public Testudinata(String name) {
        super(name, 4, true, false);
        mIsAquatic = false;
    }

    public boolean isAquatic() {
        return mIsAquatic;
    }

    public void setAquatic(boolean aquatic) {
        mIsAquatic = aquatic;
    }

    @Override
    public String toString() {
        String returnString = turtle;

        if(mIsAquatic) returnString += aquatic;
        else returnString += notAquatic;

        return super.toString() + returnString;
    }
}
