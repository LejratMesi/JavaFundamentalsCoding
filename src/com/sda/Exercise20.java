package com.sda;

import java.util.Random;
import java.util.Scanner;

public class Exercise20 {
    public static void main(String [] args){
        Scanner input = new Scanner(System.in);
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(10) +1 ;
        System.out.println("Numri random eshte :" + randomNumber);

        //for(;;) eshte sintaksa e for-loops per infinite loop
        for(;;){
            System.out.println("Ju lutem vendosni nje numer : ");
            int inputNumber = input.nextInt();
            if (inputNumber > randomNumber) {
                System.out.println("Too much");
            } else if (inputNumber < randomNumber) {
                System.out.println("Too little");
            } else if (inputNumber == randomNumber) {
                System.out.println("Congratulations");
                break;
            }
        }

    }

}
