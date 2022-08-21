package com.sda.thirdday.fourthExercise;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class MainPerson {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Vendosni datëlindjen tuaj në formatin yyyy-mm-dd");
        String datelindjaString = input.next();
        LocalDate datelindja = LocalDate.parse(datelindjaString);

        Person person = new Person("Albino", "Lumi", 29, (float) 1.80, 'M', "Juridik","IT",1,"Beqar",true,LocalDate.of(1993,03,02),true, true);
        Person person1 = new Person("Eltioni", "Kupritja", 30, (float) 1.79, 'M', "Juridik","IT",1500,"Martuar",true,LocalDate.of(1990,03,02),false, true);

        Person[] personat = new Person[]{person, person1};

        Familja familja = new Familja(personat);

        System.out.println("Emri personit qe eshte me i madhi: "+ familja.longestName());
        System.out.println("Gjatesia mesatare eshte"+familja.gjatesiaMesatare());
        System.out.println(familja.rrogaMeElarte());

        System.out.println(familja.emriMeShkurte());
        System.out.println(familja.personiMeGjate());
        System.out.println(familja.llogaritDitetEKaluara(datelindja));


    }
}
