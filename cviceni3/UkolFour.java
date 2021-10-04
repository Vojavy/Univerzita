package com.vojavy;

import java.util.Scanner;

public class UkolFour {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Zadejte a: ");
        int a = inputScanner.nextInt();

        System.out.println("Zadejte b: ");
        int b = inputScanner.nextInt();

        int x;

        if (a > b) {x = b;} else {x = a;}

        if (((a % x) != 0) || ((b % x) != 0)) {
            do { x--; } while (a % x !=0 || b % x != 0);
        }
        System.out.println(x);
    }
}
