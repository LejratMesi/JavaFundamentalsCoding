package com.sda.firstday;

import java.util.Scanner;

public class Exercise10 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni nje numer pozitiv :");
        int numer = input.nextInt();
        int shuma = 0;
        if (numer < 0) {
            System.out.println("Numri i vendosur eshte negativ. Errorr");
        } else {
            while (numer > 0) {
                int digit = numer % 10;
                shuma = shuma + digit;
                numer = numer / 10;
            }
            System.out.println("Sum of Digits: " + shuma);
        }
    }
}
