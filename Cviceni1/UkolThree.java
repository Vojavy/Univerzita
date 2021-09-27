package com.vojavy;

import java.util.Scanner;

public class UkolThree {
    public static void main(String[] args){
        final float pi = 3.1415926536f;
        System.out.println("Poloměr  kruhu?");
        Scanner inputScanner = new Scanner(System.in);
        float r = inputScanner.nextFloat();
        System.out.println("Obsah kruhu: " + (r * r * pi));
        System.out.println("Obvod kruhu: " + (2f * r * pi));
    }
}
