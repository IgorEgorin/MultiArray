package ru.orgis;

import java.util.Arrays;

public class MultyMassive {
    public static void main(String[] args) {
        int[] ar = new int[3];
        int[][] arr5 = new int[5][5];
//        arr5[0] = new int[5];
//        arr5[1] = new int[2];
//        arr5[2] = new int[4];

        arr5[2][2] = 5;
//        int[][] arrTemp = {
//                new int[2],
//                new int[10],
//                new int[20]
//        };
        int[][] arrSecond = {
                {1, 22},
                {2, 12, 4, 99},
                {12, 54, 66, 6, 153},
                {15, 12, 42}};
//        System.out.println(Arrays.toString(arr5));
//        System.out.println(Arrays.deepToString(arr5));
//        System.out.println(Arrays.deepToString(arrSecond));


//        int [[0],[0],[0],[0],[0]]
//        int [[0],[0]]
//        int [[0],[0],[0],[0]]
        for (int i = 0; i < arrSecond.length; i++) {
            for (int j = 0; j < arrSecond[i].length; j++) {
                System.out.print(arrSecond[i][j] * 2 + " ");
            }
            System.out.println();
        }
        for (int[] arrOne : arrSecond) {
            for (int arrTwo : arrOne) {
                System.out.print(arrTwo + " ");
            }
            System.out.println();
        }
        int[][][] arr3 = new int[2][3][4];
        System.out.println(Arrays.deepToString(arr3));
        //   int [0,0,0,0]
        //   int [0,0,0,0].
        //   int [0,0,0,0]
        //   int [0,0,0,0]
        //   int [0,0,0,0].
        //   int [0,0,0,0]
        //TODO прочитать про многомерные массивы.
    }

//    rebase не знаю
//    revert создает новый коммит отменяет предыдущийк
//    reset --hard безвозвратный откат
//    remote привязка локаьльного репозитория к удалкенному репозиторию
//    pull push remote работа с удаленными репозиториями

}
