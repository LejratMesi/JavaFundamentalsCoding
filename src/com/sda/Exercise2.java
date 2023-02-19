package com.sda;


// Krijojmë dy variable me float në kg dhe int në metër
// BMI është e barbartë pesha pjestu për gjatësinë
// Vlera Optimale e BMI-së duhet të jetë mes 18.5 - 24.9
// Programi shkruan BMI Optimal kur është brenda këtyre vlerave
// Programi shkruan BMI NonOptimal kur është jashtë këtyre vlerave

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Vendos Peshën");
        float pesha = input.nextFloat();

        System.out.println("Vendos Gjatësinë");
        int gjatesia = input.nextInt();
        float bmi = (float) (pesha/Math.pow(gjatesia,2) *10000);

        if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("BMI është optimale" + bmi);
        } else {
            System.out.println("BMI nuk është optimale" + bmi);
        }
    }
}
