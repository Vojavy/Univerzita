package com.vojavy;

import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Kolik chcete pokusu?");
        int numOfTryes = inputScanner.nextInt();

        int nahodneCislo = (int) (Math.random() * 100) + 1;

        System.out.print("Hádej číslo 1-100: ");
        int hadaneCislo = inputScanner.nextInt();

        while (hadaneCislo != nahodneCislo && numOfTryes != 0) {
            numOfTryes -= 1;
            if (hadaneCislo > nahodneCislo) {
                System.out.print("Zkus větší číslo: ");
            } else {
                System.out.print("Zkus menší číslo: ");
            }
            hadaneCislo = inputScanner.nextInt();
        }
        if (numOfTryes != 0) System.out.print("Uhodl jste číslo");
        else  System.out.print("Fail");

    }
}

