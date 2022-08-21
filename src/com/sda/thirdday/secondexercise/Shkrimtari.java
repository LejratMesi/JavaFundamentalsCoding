package com.sda.thirdday.secondexercise;


public class Shkrimtari {
    private  Autor shkrimtaret[];

    public Shkrimtari () {}

    public Shkrimtari (Autor shkrimtaret[]) {
        this.shkrimtaret = shkrimtaret;

    }

    public String gjejAutorQeEmriFillonMeE () {
        for (int i=0; i< shkrimtaret.length; i++) {
            if (shkrimtaret[i].getEmri().startsWith("E")) {
                return  shkrimtaret[i].getEmri();
            }
        }
        return " ";
    }

    public String gjejAutorQeEmriMbaronMeIL () {
        for (int i=0; i< shkrimtaret.length; i++) {
            if (shkrimtaret[i].getEmri().endsWith("il")) {
                return  shkrimtaret[i].getEmri();
            }
        }
        return " ";
    }

    public String emriAutorit () {
        int numriVeprave = shkrimtaret[0].getNumriVeprave();
        String autoriShumeVepra = shkrimtaret[0].getEmri();
        for (int i=0; i< shkrimtaret.length; i++) {
            if (shkrimtaret[i].getNumriVeprave()>numriVeprave) {
                numriVeprave = shkrimtaret[i].getNumriVeprave();
                autoriShumeVepra = shkrimtaret[i].getEmri();
            }
        }
        return autoriShumeVepra;
    }



    //GETTERS ***************** SETTERS
    public Autor[] getShkrimtaret() {
        return shkrimtaret;
    }

    public void setShkrimtaret(Autor[] shkrimtaret) {
        this.shkrimtaret = shkrimtaret;
    }

}
