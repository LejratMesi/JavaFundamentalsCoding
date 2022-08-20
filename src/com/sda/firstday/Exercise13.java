package com.sda.firstday;

import java.util.Scanner;

public class Exercise13 {
    public static void main (String []args){
        Scanner input = new Scanner (System.in);
        System.out.println ("Ju lutem shkruaj 1 fjali:");
        String fjalia = input.nextLine();

        String [] fjaliaDouble = fjalia.split(" ");
        for (String s: fjaliaDouble){
            System.out.print (s + " "+s + " ");
        }
    }
}
