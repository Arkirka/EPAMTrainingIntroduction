package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Thirteenth {
    /*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.*/
    public Thirteenth(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] a = new Integer[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }
        new ArrayPrint().printAllArray(a);

        for(int i = 0; i < n; i++){
            int[] tempMass = new int[n];
            for (int j = 0; j < n; j++){
                tempMass[j] = a[j][i];
            }
            Arrays.sort(tempMass);
            for (int j = 0; j < n; j++){
                a[j][i] = tempMass[j];
            }
        }

        System.out.println("Sorted array:");
        new ArrayPrint().printAllArray(a);

        for(int i = 0; i < n; i++){
            Integer[] tempMass = new Integer[n];
            for (int j = 0; j < n; j++){
                tempMass[j] = a[j][i];
            }
            Arrays.sort(tempMass, Collections.reverseOrder());
            for (int j = 0; j < n; j++){
                a[j][i] = tempMass[j];
            }
        }

        System.out.println("Reverse sorted array:");
        new ArrayPrint().printAllArray(a);
    }
}
