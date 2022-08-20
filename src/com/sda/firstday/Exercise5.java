package com.sda.firstday;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni nje numer qe do te jete kushti i ndalit te programit tone");
        int number = input.nextInt();

        for (int i = 1; i <= number; i++) {
            int counter = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter = counter + 1;
                }
            }
            if (counter == 2) {
                System.out.println(i);
            }
        }


    }
}

