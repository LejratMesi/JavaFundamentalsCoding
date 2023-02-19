package com.sda.exercise19;

public class MainClass {
    public static void main(String[] args) {
        Poem poem1 = new Poem(new Author("Lumi", "Shqiperi"),12);
        Poem poem2 = new Poem(new Author("Sallagaj", "Shqiperi"), 14);
        Poem poem3 = new Poem(new Author("Vuksani", "Shqiperi"), 16);
        Poem[] poem = new Poem[]{poem1,poem2,poem3};

        maxPoem(poem);
    }

    public static void maxPoem(Poem[] poems) {
        String surname = "";
        int max = poems[0].getStropheNumbers();
        for (int i = 1; i < poems.length; i++) {
            if (max < poems[i].getStropheNumbers()) {
                max = poems[i].getStropheNumbers();
                Author author = poems[i].getCreator();
                surname = author.getSurname();
            }


        }
        System.out.println("The longes poem written is by : " +surname + " with " +max + " Strophes");


    }

}
