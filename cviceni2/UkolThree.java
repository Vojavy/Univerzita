package com.vojavy;

import java.util.Scanner;
import java.util.*;

public class UkolThree{
    public static void main(String[] args) {


        int[] nums = new int[3];

        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Enter number 1: ");
        nums[0] = inputScanner.nextInt();

        System.out.println("Enter number 2: ");
        nums[1] = inputScanner.nextInt();

        System.out.println("Enter number 3: ");
        nums[2] = inputScanner.nextInt();

        Arrays.sort(nums);
        System.out.println(nums[2]);
    }
}