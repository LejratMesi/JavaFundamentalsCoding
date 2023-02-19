package com.sda;

import java.util.Scanner;

public class Exercise7 {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni numrin qe te llogarisim fibonaccin");
        int number = input.nextInt();
        System.out.println("F("+number+") = " + fibonacci(number));
    }

}
