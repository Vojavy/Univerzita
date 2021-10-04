package com.vojavy;

import java.util.Scanner;

public class UkolThree {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.println("Zadejte dělence: ");
        int a = inputScanner.nextInt();

        System.out.println("Zadejte dělitele: ");
        int b = inputScanner.nextInt();
        // a / b = x
        int x = 0;
        if (b == 0){
            System.out.println("Error. Dělení nulou");
        }
        // +- || -+
        else if ((a < 0) && (b > 0) || (a > 0) && (b < 0)) {
            if ((a < 0) && (b > 0)) {
                a *= -1;
                b *= -1;
            }
            while (a >= -b){
                a += b;
                x--;
            }
            System.out.println(x);
        // ++ || --
        }else {
            if ((a < 0) && (b < 0)) {
                a *= -1;
                b *= -1;
            }
            while (a >= b) {
                a -= b;
                x++;
            }
            System.out.println(x);
        }



       /*
        boolean boolVar = true;
        while (boolVar){
            if (b == 0){
                System.out.println("Error. Dělení nulou");
                boolVar = false;
            }else if ((a < 0) && (b > 0) || (a > 0) && (b < 0)){
                if ((a < 0) && (b > 0)){
                    a = a * -1;
                    b = b * -1;
                }
                for(; a + b >= 0;){
                    x--;
                    a = a + b;
                    System.out.println(a);
                }
                System.out.println(x);
                boolVar = false;
            }else{
                for(; a - b >= 0;){
                    x++;
                    a = a - b;
                    System.out.println(a);
                }
                System.out.println(x);
                boolVar = false;
            }
        }
        */
    }

}
