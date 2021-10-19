package com.vojavy;

import java.util.Random;

public class Ukol3 {
    public static void main(String[] args) {
        int[] pole = new int[10];


        Random random = new Random();

        for (int i = 0; i < 10; i++){
            pole[i] = random.nextInt(10);
        }

        arraysOut(pole);

        quicksort(pole, 0, pole.length);

        arraysOut(pole);

        arraysOut(reverse(pole));
    }




    public static void quicksort(int[] pole, int left, int right){
        if(left < right){
            int boundary = left;
            for(int i = left + 1; i < right; i++){
                if(pole[i] > pole[left]){
                    swap(pole, i, ++boundary);
                }
            }
            swap(pole, left, boundary);
            quicksort(pole, left, boundary);
            quicksort(pole, boundary + 1, right);
            arraysOut(pole);
        }
    }

    private static void swap(int[] array, int left, int right) {
        int tmp = array[right];
        array[right] = array[left];
        array[left] = tmp;
    }

    public static void arraysOut(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static int[] reverse(int[] pole){
        for (int i = 0; i < pole.length/2; i++){
            int tmp  = pole[pole.length - (1 + i)];
            pole[pole.length - (1 + i)] = pole[i];
            pole[i] = tmp;
        }
         return  pole;
    }
}
