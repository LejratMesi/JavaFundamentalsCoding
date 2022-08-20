package com.sda.firstday;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ju lutem vendosni numrin me te madh :");
        int numer = input.nextInt();

        if (numer < 0) {
            System.out.println("Error");
        } else {

            for (int i = 1; i <= numer; i++) {
                System.out.println(i);
                if (i % 3 == 0 && i % 7 == 0) {
                    System.out.println("Fizz buzz " + i);
                } else if (i % 3 == 0) {
                    System.out.println("Fizz " + i);

                } else if (i % 7 == 0) {
                    System.out.println("Buzz " + i);
                }
            }


        }
    }

}
