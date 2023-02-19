package com.sda.fourthExercise;


import java.time.LocalDate;
import java.time.Period;

public class Familja {
    private Person personat[];

    public Familja () {};

    public Familja (Person personat[]) {
        this.personat = personat;
    }

    public Person[] getPersonat() {
        return personat;
    }

    public void setPersonat(Person[] personat) {
        this.personat = personat;
    }
    public String emriMeShkurte () {
        String emriShkurte = personat[0].getEmri();
        for (int i=1; i < personat.length; i++) {
            if (personat[i].getEmri().length() < emriShkurte.length()){
                emriShkurte = personat[i].getEmri();
            }
        }
        return emriShkurte;
    }

    public float personiMeGjate () {
        float maxGjatesia = 0;
        for (int i=0; i<personat.length; i++) {
            if (personat[i].getGjatesia() > maxGjatesia) {
                maxGjatesia = (int) personat[i].getGjatesia();
            }
        }
        return maxGjatesia;
    }

    public String longestName(){
        String longestName = personat[0].getEmri();
        for(int i = 1; i<personat.length;i++){
            if(personat[i].getEmri().length() >longestName.length()  ){
                longestName = personat[i].getEmri();
            }
        }
        return longestName;
    }

    public float gjejMoshenMesatare(){
        float sum = 0f;
        for (int i = 0; i < personat.length;i++){
            sum += personat[i].getMosha();
        }

        return sum/personat.length;
    }

    public float gjatesiaMesatare(){
        float  sum = 0.0f;
        for (int i = 0; i< personat.length; i++){
            sum +=personat[i].getGjatesia();
        }
        return sum/ personat.length;
    }
    public String rrogaMeElarte(){
        int max = personat[0].getRroga();
        String emri =personat[0].getEmri();
        for (int i = 1; i < personat.length;i++){
            if(max < personat[i].getRroga()){
                max = personat[i].getRroga();
                emri = personat[i].getEmri();
            }
        }
        return emri;

    }

    public int llogaritDitetEKaluara(LocalDate userInput){

       return Period.between(userInput, LocalDate.now()).getDays();
    }


}
