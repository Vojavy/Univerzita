package com.vojavy;

import java.util.Scanner;

public class UkolOne {

    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        System.out.print("Jmeno: ");
        String name = inputScanner.nextLine();

        System.out.print("Prijmeni: ");
        String surname = inputScanner.nextLine();

        System.out.println("Vase jmeno a prijemeni: " + name + " " + surname);
    }
}