package com.sda.firstexercise;

public class MainClass {
    public static void main(String[] args) {
        Apartament apartament1 = new Apartament(30,9,"blue", "28 nentori");
        Apartament apartament2 = new Apartament(12,5,"red", "29 nentori");
        Apartament apartament3 = new Apartament(31,6,"black", "30 nentori");
        Apartament apartament4 = new Apartament(451,8,"white", "1 nentori");
        Apartament apartament5 = new Apartament(33,2,"purple", "2 nentori");
        Apartament[] apartaments = new Apartament[]{apartament1,apartament2,apartament3,apartament4,apartament5};
        Bllok bllok = new Bllok(apartaments,"Shkodra");
        System.out.println(bllok.gjejApartamentin());
    }
}
