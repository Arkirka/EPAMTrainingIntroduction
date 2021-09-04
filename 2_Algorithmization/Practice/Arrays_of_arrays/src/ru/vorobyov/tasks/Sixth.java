package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Sixth {
    //TODO 7-10
    /*Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):*/
    public Sixth(){
        System.out.println("Print number (N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        byte a[][] = new byte[n][n];

        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = 1;
            }
        }

        var number = 0;
        for (int i = 0; i < n / 2; i++){
            for (int j = 0; j < number; j++){
                a[i][j] = 0;
                a[i][n - j - 1] = 0;
            }
            number++;
        }

        number = 0;
        for (int i = n - 1; i > n / 2 - 1; i--){
            for (int j = 0; j < number; j++){
                a[i][j] = 0;
                a[i][n - j - 1] = 0;
            }
            number++;
        }

        new ArrayPrint().printAllArray(a);
    }
}
