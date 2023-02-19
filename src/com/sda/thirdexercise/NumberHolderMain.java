package com.sda.thirdexercise;


public class NumberHolderMain {
    public static void main(String[] args) {
        NumberHolder vlera1 = new NumberHolder(5, (float) 6.6);
        NumberHolder vlera2 = new NumberHolder(7, (float) 8.8);

        System.out.println(vlera1.getAnInt());
        System.out.println(vlera1.getaFloat());
        System.out.println(vlera2.getAnInt());
        System.out.println(vlera2.getaFloat());

    }
}
