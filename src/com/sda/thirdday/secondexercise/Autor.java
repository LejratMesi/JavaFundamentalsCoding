package com.sda.thirdday.secondexercise;


public class Autor {
    private String emri;
    private String mbiemri;
    private int numriVeprave;

    public Autor () {}

    public Autor (String emri, String mbiemri, int numriVeprave) {
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.numriVeprave = numriVeprave;
    }

    public String getEmri() {
        return emri;
    }

    public void setEmri(String emri) {
        this.emri = emri;
    }

    public String getMbiemri() {
        return mbiemri;
    }

    public void setMbiemri(String mbiemri) {
        this.mbiemri = mbiemri;
    }

    public int getNumriVeprave() {
        return numriVeprave;
    }

    public void setNumriVeprave(int numriVeprave) {
        this.numriVeprave = numriVeprave;
    }
}









