package com.company;

/**
 * Created by Jonathan Taylor on 6/28/16.
 */
public class Ungulate extends Mammal{
    private int mNumToes;
    private String mOrder;

    private static final String ungulate = "\n    |------- They are also an Ungulate ";
    private static final String threeToes = "with 3 toes ";
    private static final String fourToes = "with 4 toes ";


    public Ungulate(String name, int numToes) {
        super(name);
        mNumToes = numToes;
        switch(numToes){
            case 3:
                mOrder = "Perissodactyl";
                break;
            case 4:
                mOrder = "Artiodactyl";
                break;
            default:
                mOrder = "what is this!?";
        }
    }

    public Ungulate(String name) {
        super(name);
        mNumToes = 4;
        mOrder = "Artiodactyl";
    }

    public int getNumToes() {
        return mNumToes;
    }

    public void setNumToes(int numToes) {
        mNumToes = numToes;
    }

    public String getOrder() {
        return mOrder;
    }

    @Override
    public String toString() {
        String returnString = ungulate;

        switch(mNumToes){
            case 3:
                returnString += (threeToes + "and so is a " + mOrder + ".");
                break;
            case 4:
                returnString += (fourToes + "and so is an " + mOrder + ".");
                break;
            default:
                returnString += ("with " + mNumToes + " toes so..." + mOrder);
        }
        return super.toString() + returnString;
    }
}
