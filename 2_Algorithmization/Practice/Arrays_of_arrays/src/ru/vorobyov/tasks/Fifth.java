package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Fifth {
    /*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное) */
    public Fifth(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] a = new int[n*2][n*2];
        var max = n*2 - 1;

        for (int i = 0; i < n * 2; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = j + 1;
                a[i][(n*2) - j - 1] = j + 1;
            }
        }

        for (int i = 0; i < n * 2; i++){
            int j = n*2 - 1;
            while (j > max){
                a[i][j] = 0;
                j--;
            }
            max--;
        }

        new ArrayPrint().printAllArray(a);
    }
}
