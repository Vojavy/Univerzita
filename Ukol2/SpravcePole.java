package com.vojavy.Ukol2;

import java.util.Random;

public class SpravcePole {

    int[] pole;

    public SpravcePole(int delkaPole){
        pole = new int[delkaPole];
        Random random = new Random();
        for (int i = 0; i < delkaPole; i++){
            pole[i] = random.nextInt(100);
        }
        this.pole = pole;
    }

    public int min() {
        int min = 0;
        for (int i = 0; i < this.pole.length-2; i++) {
            if (this.pole[i] < this.pole[i+1]) {
                min = this.pole[i];
            }
        }
        if (this.pole[this.pole.length-1] < min) this.pole[this.pole.length-1] = min;
        return min;
    }

    public int sum(){
        int sum = 0;
        for (int i = 0; i < this.pole.length; i++) {
            sum += this.pole[i];
        }
        return sum;
    }

    public int prum(){
        return sum() / this.pole.length;
    }


    public String toString(){
        String poleString = "[";
        for (int i = 0; i < this.pole.length - 1; i++) {
            poleString = poleString + this.pole[i] + ", ";
        }
        poleString = poleString + this.pole[this.pole.length - 1];
        poleString = poleString + " ]";
        poleString = poleString + " Suma pole: " + sum() + " Prumer pole: " + prum() + " Minimum v pole: " + min();
        return poleString;
    }
}
