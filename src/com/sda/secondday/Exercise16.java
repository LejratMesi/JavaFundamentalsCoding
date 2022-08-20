package com.sda.secondday;

import java.util.Scanner;

public class Exercise16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numrat[] = new int[10];
        populloArray(input,numrat);
        printoArray(numrat);
        gjejSekuencenMETEGjate(numrat);
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

    public static void gjejSekuencenMETEGjate(int numrat[]){
        int maxCount = 0;
        int count = 1;
        for(int i = 1 ; i< numrat.length;i++){
            if(numrat[i] > numrat[i-1]){
                count++;
            } else if(maxCount<=count){
                maxCount = count;
                count = 1;
            }

            if(maxCount < count){
                maxCount = count;
            }
        }
        System.out.println(maxCount);
    }

}
