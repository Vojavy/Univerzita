package com.vojavy.ukol1;

public class Ukol1 {

    public static void main(String[] args) {
        Kostka kostka1 = new Kostka(12);
        Kostka kostka2 = new Kostka(12);

        System.out.println(kostka1.toString());
        System.out.println(kostka2.toString());

        System.out.println(kostka1.hodKostkou());
        System.out.println(kostka2.hodKostkou());
    }
}
