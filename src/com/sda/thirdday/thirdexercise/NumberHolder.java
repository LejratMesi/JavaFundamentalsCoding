package com.sda.thirdday.thirdexercise;

public class NumberHolder{
    public int anInt;
    public float aFloat;

    public NumberHolder () {}

    public NumberHolder (int anInt, float aFloat) {
        this.anInt = anInt;
        this.aFloat = aFloat;
    }

    public int getAnInt() {
        return anInt;
    }

    public void setAnInt(int anInt) {
        this.anInt = anInt;
    }

    public float getaFloat() {
        return aFloat;
    }

    public void setaFloat(float aFloat) {
        this.aFloat = aFloat;
    }
}
