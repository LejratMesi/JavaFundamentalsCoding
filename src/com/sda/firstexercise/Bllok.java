package com.sda.firstexercise;

public class Bllok {
    private Apartament apartaments[];
    private String emri;

    //Default constructor
    public Bllok(){}
    //Constructor with parameters
    public Bllok(Apartament []apartaments, String emri){
        this.apartaments = apartaments;
        this.emri = emri;
    }
    //
    public String gjejApartamentin(){

        int max = apartaments[0].getNumriShtepiveTeShitura();
        String emri = apartaments[0].getEmri();
        for (int i = 1; i < apartaments.length; i++){
            if(apartaments[i].getNumriShtepiveTeShitura() > max){
                max = apartaments[i].getNumriShtepiveTeShitura();
                emri = apartaments[i].getEmri();
            }
        }
        return emri;
    }

    public Apartament[] getApartaments() {
        return apartaments;
    }

    public void setApartaments(Apartament[] apartaments) {
        this.apartaments = apartaments;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }
}
