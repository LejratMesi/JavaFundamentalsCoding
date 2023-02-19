package com.sda;

import java.util.Scanner;

public class Exercise14 {
    public static void main( String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni germen e pare");
        char letter1 = input.next().charAt(0);
        System.out.println("Ju lutem vendosni germen e dyte");
        char letter2 = input.next().charAt(0);


        //  char letter1 = 'a';
        // char letter2 = 'e';
        int shkronja = (int) letter1;
        int shkronja2 = (int) letter2;
        int shuma = Math.abs(shkronja2 - shkronja);
        System.out.println("numri i karaktereve  midis  dy germave eshte: " + shuma);

    }
}
