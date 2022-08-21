package com.sda.thirdday.secondexercise;

import com.sda.thirdday.secondexercise.Autor;
import com.sda.thirdday.secondexercise.Shkrimtari;

public class MainClass {
    public static void main(String[] args) {
        Autor autori1 = new Autor("Albino", "Lumi", 100);
        Autor autori2 = new Autor("Eltion", "Kuptrija", 50);
        Autor autori3 = new Autor("Elvis", "Kavaja", 101);
        Autor autori4 = new Autor("Rais", "Sallagaj", 35);
        Autor autori5 = new Autor("Paolo", "Vuksani", 35);
        Autor autori6 = new Autor("Eltionil", "Kuprija", 44);

        Autor autoret[] = new Autor[] {autori1, autori2, autori3, autori4, autori5, autori6};

        Shkrimtari shkrimtaret = new Shkrimtari(autoret);
        System.out.println(shkrimtaret.emriAutorit());
        System.out.println(shkrimtaret.gjejAutorQeEmriFillonMeE());
        System.out.println(shkrimtaret.gjejAutorQeEmriMbaronMeIL());
    }
}
