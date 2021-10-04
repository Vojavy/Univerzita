package com.vojavy;

import java.util.Scanner;

public class UkolOne {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Který měsic?");
        switch (inputScanner.nextInt()){
            case  (1):
                System.out.println("Leden");
                break;
            case  (2):
                System.out.println("Únor");
                break;
            case  (3):
                System.out.println("Březen");
                break;
            case  (4):
                System.out.println("Duben");
                break;
            case  (5):
                System.out.println("Květen");
                break;
            case  (6):
                System.out.println("Červen");
                break;
            case  (7):
                System.out.println("Červenec");
                break;
            case  (8):
                System.out.println("Srpen");
                break;
            case  (9):
                System.out.println("Září");
                break;
            case  (10):
                System.out.println("Říjen");
                break;
            case  (11):
                System.out.println("Listopad");
                break;
            case  (12):
                System.out.println("Prosinec");
                break;
            default:
                System.out.println("Neplatná hodnota");
                break;
        }
    }
}
