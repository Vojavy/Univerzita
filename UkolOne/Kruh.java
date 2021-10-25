package com.vojavy.UkolOne;

public class Kruh {
    double polomer;
    double pi = 3.1415;
    public Kruh(double polomer){
        this.polomer = polomer;
    }
    private double dejObvod(){
        double obvod = this.polomer * 2 * pi;
        return obvod;
    }
    private double dejObsah(){
        double obsah = this.polomer *  this.polomer * pi;
        return obsah;
    }
    public String toString(){
        return ("Polomer kruha: " + this.polomer + " Obvod kruha: " + dejObvod() + " Obsah kruha: " + dejObsah());
    }

}
