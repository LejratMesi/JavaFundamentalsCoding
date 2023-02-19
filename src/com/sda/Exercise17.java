package com.sda;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Locale;
import java.util.Scanner;

public class Exercise17 {
    public static void main(String[] args) {
        System.out.println(" Enter in  following format : dd/MM/yyyy");
        Scanner input = new Scanner(System.in);
        String regDate=input.nextLine();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy", Locale.ENGLISH);
        LocalDate userDate = LocalDate.parse(regDate, dtf);
        LocalDate targetDate = userDate.withDayOfMonth(20).withMonth(8).plusYears(0);
        System.out.println("User's date: " + regDate);
        System.out.println("Target date: " + targetDate.format(dtf));
        Period period = Period.between( targetDate,userDate);
        System.out.printf("Days left: " + period.getDays());

    }
}
