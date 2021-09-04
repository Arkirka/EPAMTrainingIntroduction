package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Scanner;

public class Seventh {
    /*Сформировать квадратную матрицу порядка N по правилу:
    A[i, j] = sin( (i*i + j*j) / N )
    и подсчитать количество положительных элементов в ней*/
    public Seventh(){
        System.out.println("Print number (N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        double a[][] = new double[n][n];

        var numOfPositive = 0;
        for (int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                a[i][j] = Math.sin( (i*i + j*j) / n );

                if (a[i][j] > 0)
                    numOfPositive++;
            }
        }

        new ArrayPrint().printAllArray(a);
        System.out.println("Number of positive elements: " + numOfPositive);
    }
}
