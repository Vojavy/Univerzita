package com.vojavy.UkolOne;

import java.util.Scanner;

public class Ukol1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ukazte polomer 1 kruhu");
        Kruh kruh1 = new Kruh(scanner.nextDouble());
        System.out.println("Ukazte polomer 2 kruhu");
	    Kruh kruh2 = new Kruh(scanner.nextDouble());
        System.out.println(kruh1.toString());
        System.out.println(kruh2.toString());
    }
}
