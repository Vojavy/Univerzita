package com.vojavy;

import java.util.Scanner;

public class UkolTwo {
    public static void main(String[] args) {
        System.out.println("Enter number: ");
        Scanner inputScanner = new Scanner(System.in);
        int num = inputScanner.nextInt();
        if (num > 0){
            System.out.println("Je kladne");
        }else if (num < 0){
            System.out.println("Je zapone");
        }else {
            System.out.println("Stejne 0");
        }
    }
}
