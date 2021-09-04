package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Scanner;

public class Fifteen {
    /*Найдите наибольший элемент матрицы и заменить все нечетные элементы на него*/
    public Fifteen(){
        System.out.println("Print number(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        Integer[][] a = new Integer[n][n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = (int) (Math.random() * (i + 10));
                if(max < a[i][j])
                    max = a[i][j];
            }
        }
        new ArrayPrint().printAllArray(a);

        System.out.println("Max element = " + max);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(a[i][j] % 2 != 0)
                    a[i][j] = max;
            }
        }
        new ArrayPrint().printAllArray(a);
    }
}
