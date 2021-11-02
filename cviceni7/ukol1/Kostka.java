package com.vojavy.ukol1;

import java.util.Random;

public class Kostka {

    int pocetsten;

    public Kostka(int pocetsten){
    this.pocetsten = pocetsten;
    }

    public int hodKostkou(){
        Random random = new Random();
        int stena = random.nextInt((pocetsten-1)+1);
        return stena;
    }

    public String toString(){
        String kostkaInfo = "Pocet sten: " + pocetsten;
        return kostkaInfo;
    }
}
