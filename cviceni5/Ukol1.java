package com.vojavy;

import java.util.Random;

public class Ukol1 {

    public static void main(String[] args) {
        // Vytvorte 1D pole1 o velikosti 10 s čísly 1-10
        // Vytvorte 1D pole2 o velikosti 10 s náhodnými čísli 0-10
        int[] pole1 = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] pole2 = new int[10];

        Random random = new Random();


        for (int i = 0; i < 10; i++){
            System.out.println(i);
            pole2[i] = random.nextInt(10);
        }

        arraysOut(pole1);
        arraysOut(pole2);

        // Vytvořte funkce zjistujici minimální hodnotu prvku v poli,
        // sumu a průměru prvků
        // Vypočítané hodnoty vypiště do konzole
        System.out.println("Minimalni prvek pole1: " + min(pole1));
        System.out.println("Minimalni prvek pole2: " + min(pole2));

        System.out.println("Suma pole1: " + sum(pole1));
        System.out.println("Suma pole2: " + sum(pole2));

        System.out.println("Prumer pole1: " + prum(pole1));
        System.out.println("Prumer pole2: " + prum(pole2));

    }

    public static int min(int[] array) {
        int min = 10;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    public static int sum(int[] array){
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public static int prum(int[] array){
        return  sum(array) / array.length;
    }



    public static void arraysOut(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
}
