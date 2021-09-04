package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Ninth {
    /* Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
    столбец содержит максимальную сумму*/
    public Ninth(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];
        int[] columnSums = new int[n];
        int maxColumnSum = 0;
        int maxColumnNum = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                columnSums[j] += a[i][j];
        }

        for(int i = 1; i < n; i++){
            if(maxColumnSum < columnSums[i]){
                maxColumnSum = columnSums[i];
                maxColumnNum = i;
            }
        }

        new ArrayPrint().printAllArray(a);
        System.out.println("Max sum " + maxColumnSum + " in column " + maxColumnNum);

    }
}
