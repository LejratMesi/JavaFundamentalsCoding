package com.sda;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        double sum = 0.0;

        for (int i = 1 ;i <= n ; i++){

            sum += 1.0 /  i;

        }
        System.out.println("Harmonic value = " +sum );
    }

}
