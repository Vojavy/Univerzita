package com.vojavy;

import java.util.Scanner;

public class UkolOne {

    public static void main(String[] args) {
            System.out.println("kolik galonu");
            Scanner inputScanner = new Scanner(System.in);
            System.out.println("litru:" + (inputScanner.nextFloat() * 3.7854f));

    }
}
