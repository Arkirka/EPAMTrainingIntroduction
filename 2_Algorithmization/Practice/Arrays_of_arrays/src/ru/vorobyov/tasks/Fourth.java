package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Fourth {
    /*. Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).*/

    public Fourth(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n][n];

        for (int i = 0; i < a.length; i += 2) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = j + 1;
        }

        for (int i = 1; i < a.length; i += 2) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = n - j;
        }

        new ArrayPrint().printAllArray(a);
    }
}
