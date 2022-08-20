package com.sda.secondday;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Exercise18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String word = input.next();
        Pattern pattern = Pattern.compile("acho+!");
        Matcher matcher = pattern.matcher(word);
        System.out.println(matcher.matches());

    }
}
