package com.sda.firstday;

import java.util.Scanner;

public class Exercise1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Ju lutem vendosni rrezen e rrethit");
        float diameter = input.nextFloat();

        float perimeter = (float) (2 * Math.PI * (diameter/2));

        System.out.println("Perimeter of the circle is : "  + perimeter);


    }
}
