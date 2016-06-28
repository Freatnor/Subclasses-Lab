package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Carnivora extends Mammal{
    private boolean mIsCarnivore;

    private static final String carn = "\n    |------- They are also a member of Carnivora ";
    private static final String carnivore = "which is a carnivore...";
    private static final String notCarnivore = "which is not a carnivore!";

    @Deprecated
    public Carnivora(String name, boolean isCarnivore) {
        super(name);
        mIsCarnivore = isCarnivore;
    }

    public Carnivora(String name) {
        super(name);
        mIsCarnivore = true;
    }

    public boolean isCarnivore() {
        return mIsCarnivore;
    }

    public void setCarnivore(boolean carnivore) {
        mIsCarnivore = carnivore;
    }

    @Override
    public String toString() {
        String returnString = carn;

        if(mIsCarnivore) returnString += carnivore;
        else returnString += notCarnivore;
        return super.toString() + returnString;
    }
}
