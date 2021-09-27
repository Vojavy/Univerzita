package com.vojavy;

import java.util.Scanner;

public class UkolTwo {
    public static void main(String[] args) {
        System.out.println("vaha na zemi");
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("vasa vaha na mesici: " + (inputScanner.nextFloat() * 0.17f) + " kg");
    }
}
