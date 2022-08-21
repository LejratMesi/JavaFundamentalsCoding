package com.sda.thirdday.fourthExercise;

import java.time.LocalDate;
import java.util.Date;

public class Person {
    private String emri;
    private String mbiemri;
    private int mosha;
    private float gjatesia;
    private char gjinia;
    private String fakulteti;
    private String puna;
    private int rroga;
    private String gjendjaCivile;
    private boolean kaMakine;
    private LocalDate ditelindja;
    private boolean kaVellezer;
    private boolean kaMotra;

    public Person(){}

    public Person(String emri, String mbiemri, int mosha, float gjatesia, char gjinia, String fakulteti, String puna, int rroga
            , String gjendjaCivile, boolean kaMakine, LocalDate ditelindja, boolean kaVellezer, boolean kaMotra){
        this.emri = emri;
        this.mbiemri = mbiemri;
        this.mosha = mosha;
        this.gjatesia = gjatesia;
        this.gjinia = gjinia;
        this.fakulteti = fakulteti;
        this.puna = puna;
        this.rroga = rroga;
        this.gjendjaCivile = gjendjaCivile;
        this.kaMakine = kaMakine;
        this.ditelindja = ditelindja;
        this.kaVellezer = kaVellezer;
        this.kaMotra = kaMotra;
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

    public int getMosha() {
        return mosha;
    }

    public void setMosha(int mosha) {
        this.mosha = mosha;
    }

    public float getGjatesia() {
        return gjatesia;
    }

    public void setGjatesia(float gjatesia) {
        this.gjatesia = gjatesia;
    }

    public char getGjinia() {
        return gjinia;
    }

    public void setGjinia(char gjinia) {
        this.gjinia = gjinia;
    }

    public String getFakulteti() {
        return fakulteti;
    }

    public void setFakulteti(String fakulteti) {
        this.fakulteti = fakulteti;
    }

    public String getPuna() {
        return puna;
    }

    public void setPuna(String puna) {
        this.puna = puna;
    }

    public int getRroga() {
        return rroga;
    }

    public void setRroga(int rroga) {
        this.rroga = rroga;
    }

    public String getGjendjaCivile() {
        return gjendjaCivile;
    }

    public void setGjendjaCivile(String gjendjaCivile) {
        this.gjendjaCivile = gjendjaCivile;
    }

    public boolean isKaMakine() {
        return kaMakine;
    }

    public void setKaMakine(boolean kaMakine) {
        this.kaMakine = kaMakine;
    }

    public LocalDate getDitelindja() {
        return ditelindja;
    }

    public void setDitelindja(LocalDate ditelindja) {
        this.ditelindja = ditelindja;
    }

    public boolean isKaVellezer() {
        return kaVellezer;
    }

    public void setKaVellezer(boolean kaVellezer) {
        this.kaVellezer = kaVellezer;
    }

    public boolean isKaMotra() {
        return kaMotra;
    }

    public void setKaMotra(boolean kaMotra) {
        this.kaMotra = kaMotra;
    }
}
