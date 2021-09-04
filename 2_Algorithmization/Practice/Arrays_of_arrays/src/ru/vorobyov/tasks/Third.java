package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Third {
    /*Дана матрица. Вывести k-ю строку и p-й столбец матрицы*/
    public Third(){
        System.out.println("Print 2 numbers(k and p)");
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int p = sc.nextInt();

        int[][] a = new int[6][6];

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }

        new ArrayPrint().printAllArray(a);
        System.out.println("Row: " + k);
        new ArrayPrint().printRow(a, k);
        System.out.println("Column: " + p);
        new ArrayPrint().printColumn(a, p);

    }
}
