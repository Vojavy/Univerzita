package com.vojavy;

import java.math.BigInteger;
import java.util.Scanner;

public class UkolTwo {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);
        long j = inputScanner.nextInt();
        BigInteger result = BigInteger.ONE;
            for (long x = 1; x <= j; x++) {
                result = result.multiply(BigInteger.valueOf(x));
            }
            System.out.println(j + "! = " + result);
    }
}
