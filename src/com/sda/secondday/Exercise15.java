package com.sda.secondday;


import java.util.Scanner;

/*
* Write an application that reads from the user 10 arbitrarily large numbers (variables of
type int) and prints those that occurred at least twice.
**/
public class Exercise15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numrat[] = new int[10];
        populloArray(input,numrat);
        printoArray(numrat);
        sortArray(numrat);
        System.out.println("After sort method that we created: ");
        printoArray(numrat);
        printoNumratQePerseriten(numrat);

    }
    public static void populloArray(Scanner input, int numrat[]){
        //Krijova ciklin for
        for (int index = 0;index < numrat.length; index++){
            System.out.println("Jepni vleren ne pozicionin  " + (index+1) + " te arrayt");
            numrat[index] = input.nextInt();
        }
    }

    public static void printoArray(int array[]){
        System.out.print("[ ");
        for (int i = 0;i< array.length;i++){
            System.out.print(array[i] + ",");
        }
        System.out.print(" ] ");
        System.out.println("-----------------------------");
    }


    public static void sortArray(int [] numrat){
        int temp =0;
        for (int i = 0; i <numrat.length-1; i++) {
            for (int j = i+1; j <numrat.length; j++) {
                if(numrat[i] >numrat[j]) {      //swap elements if not in order
                    temp = numrat[i];
                    numrat[i] = numrat[j];
                    numrat[j] = temp;
                }
            }
        }
    }

    public static void printoNumratQePerseriten(int []numrat){

        for (int i = 0; i< numrat.length-1;i++){
            int count = 1;
            if(i>=1 && numrat[i] == numrat[i-1]){
                continue;
            }

            for (int j = i+1 ; j< numrat.length; j++ ){
                if(numrat[i] == numrat[j]){
                    count += 1;
                }
            }

            if(count >= 2 ){
                System.out.println("numri qe eshte perseritur te pakten 2 here eshte ");
                System.out.println(numrat[i]);
            }

        }

    }

}

