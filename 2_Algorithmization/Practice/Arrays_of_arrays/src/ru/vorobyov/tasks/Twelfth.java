package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Twelfth {
    /*Отсортировать строки матрицы по возрастанию и убыванию значений элементов.*/
    public Twelfth(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] a = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }
        new ArrayPrint().printAllArray(a);

        for (Integer[] row:
             a) {
            Arrays.sort(row);
        }

        System.out.println("Sorted array:");
        new ArrayPrint().printAllArray(a);

        for (Integer[] row:
                a) {
            Arrays.sort(row, Collections.reverseOrder());
        }

        System.out.println("Reverse sorted array:");
        new ArrayPrint().printAllArray(a);
    }
}
