package com.vojavy;

public class Ukol2 {

    public static void main(String[] args) {
        int[][] pole = inicializace(10);
        vypis(pole);
        System.out.println();
        vypis( vloz(12, 1,1,pole));
    }

    public static int[][] vloz(int prvek, int x, int y, int [][] pole) {
        pole[y][x] = prvek;
        return pole;
    }

    public static void vypis(int [][] pole) {

        for (int i = 0; i < pole.length; i++) {
            for (int j = 0; j < pole[i].length; j++) {
                System.out.print(pole[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static int [][] inicializace(int velikost) {
        int [][] pole = new int[velikost][velikost];
        pole[0][0]= 1;
        for (int i = 0; i< velikost-1; i++){
            pole[i+1][0] = pole[i][0] + 1;
        }
        for (int y = 0; y< velikost; y++){
            for (int x = 1; x<velikost; x++){
                pole[y][x] = pole[y][0] * (x+1);
            }
        }
        return pole;
    }
}
