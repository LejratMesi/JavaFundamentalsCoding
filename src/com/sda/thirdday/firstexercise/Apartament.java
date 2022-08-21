package com.sda.thirdday.firstexercise;

public class Apartament {
    private int numriShtepiveTeShitura;
    private int numriKateve;
    private String ngjyra;
    private String emri;

    public Apartament(){}
    public Apartament(int numriShtepiveTeShitura,int numriKateve, String ngjyra,String emri){
        this.emri = emri;
        this.ngjyra = ngjyra;
        this.numriKateve = numriKateve;
        this.numriShtepiveTeShitura = numriShtepiveTeShitura;
    }

    public int getNumriShtepiveTeShitura() {
        return numriShtepiveTeShitura;
    }

    public void setNumriShtepiveTeShitura(int numriShtepiveTeShitura) {
        this.numriShtepiveTeShitura = numriShtepiveTeShitura;
    }

    public int getNumriKateve() {
        return numriKateve;
    }

    public void setNumriKateve(int numriKateve) {
        this.numriKateve = numriKateve;
    }

    public String getNgjyra() {
        return ngjyra;
    }

    public void setNgjyra(String ngjyra) {
        this.ngjyra = ngjyra;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }
}
