package com.sda.firstday;

import java.util.Scanner;

/*
Write an application that will read texts (variables of the String type) until the user gives
the text "Enough!" and then writes the longest of the given texts (not including the text
"Enough!"). If the user does not provide any text, write "No text provided".
 */

public class Exercise11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Jepni nje fjali");
        String word= input.nextLine();
        int max=0;
        String longestWord = word;

        while (!word.equalsIgnoreCase("Enough!")) {
            if (max < word.length()) {
                max = word.length();
                longestWord = word;
            }
            System.out.println("Jepni nje fjali");
            word = input.nextLine();
        }
        if(word.equalsIgnoreCase("Enough!")){
            System.out.println("No text provided");
        } else {
            System.out.println("Fjala me e madhe qe ju keni shkruajr eshte : " + longestWord);
        }


    }
}
