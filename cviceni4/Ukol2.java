package com.vojavy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int i = 0;

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Kolik otvoru v revolveru");
        int holesNum = inputScanner.nextInt();
        inputScanner.nextLine();

        boolean hrajePocitac = true;

        int poziceKulkyVBubinku = (int) (Math.random() * holesNum); // pozice kulky v šestiranném bubínku revolveru
        System.out.println("Roztočení bubínku... Cvak!");
        int poziceBubinku = (int) (Math.random() * holesNum); // říká, který z otvorů bubínku je vybrán ke střelbě

        System.out.println("Hraje PC");

        if (poziceKulkyVBubinku != poziceBubinku) System.out.println("Nic!");

        while (poziceKulkyVBubinku != poziceBubinku) {
            hrajePocitac = !hrajePocitac;

            do {
                if (i == 0) poziceBubinku = (int) (Math.random() * holesNum);
                else {
                    if (poziceBubinku == holesNum - 1) poziceBubinku = 1;
                    else  poziceBubinku +=1;
                }
                if (hrajePocitac) {
                    System.out.println("Hraje PC");
                    if (poziceKulkyVBubinku == poziceBubinku) break;
                    else System.out.println("Nic!");
                } else {
                    System.out.println("Hraješ ty");

                    System.out.println("Roztočete bubínku");
                    inputScanner.nextLine();

                    System.out.println("Zmáčknete spoušť");
                    inputScanner.nextLine();

                    if (poziceKulkyVBubinku == poziceBubinku) break;
                    else System.out.println("Nic!");
                }
                i += 1;
            } while (i < 2);
            i = 0;
        }

        System.out.println("Bum!");

        if (hrajePocitac) {
            System.out.println("Vyhrál jsi! :)");
        } else {
            System.out.println("Prohrál jsi :(");
        }

        // -- dodatečné úkoly --
        // přidat čekání na akci (zmáčknutí spouště) uživatele
        // předělat magickou konstantu 6 na pojmenovanou konstantu a zkoušet hru s různými počty otvorů v revolveru
        // předělat hru na extrémnější variantu, kde se od druhého pokusu už netočí a jde se dál,
        // - tady potřeba napojit konec bubínku na začátek bubínku, aby se pořád otáčel dokola (int proměnná, co se bude zvyšovat a pak modulo % nebo nulování za koncem)

    }
}
