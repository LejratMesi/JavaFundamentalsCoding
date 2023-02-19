package com.sda;

import java.util.Scanner;

public class Exercise8 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Insert number 1");
            float number1 = input.nextFloat();
            System.out.println("Choose an operator: +, -, *, or /");
            char operator = input.next().charAt(0);
            System.out.println("Insert number 2");
            float number2 = input.nextFloat();


            switch (operator) {
                case '+':
                    llogaritShume(number1,number2);
                    break;

                case '-':
                   llogaritZbritjen(number1,number2);
                    break;

                case '*':
                    llogaritShumezimin(number1,number2);
                    break;

                case '/':
                    llogaritPjestimin(number1,number2);
                    break;

                default :
                    System.out.println ("Invalid symbol");
                    break;

            }

        }
        static void llogaritShume(float numer1, float numer2){
            System.out.println(numer1+numer2);
        }

        static void llogaritShumezimin(float numer1, float numer2){
            System.out.println(numer1*numer2);
        }

         static void llogaritZbritjen(float numer1, float numer2){
            System.out.println(numer1-numer2);
        }

         static void llogaritPjestimin(float number1, float number2){
            if(number2 == 0){
                System.out.println("Cannot be done");
            } else {
                float result = number1 / number2;
                System.out.println(number1 + "/" + number2 + "=" + result);
            }
        }
}
