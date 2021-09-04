package ru.vorobyov;

import java.util.Scanner;

public class Third {
    /*Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
положительных и нулевых элементов.*/
    Third(){
        System.out.println("Print numbers(N and elements of array)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int positive = 0;
        int negative = 0;
        int zeroNumbers = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > 0)
                positive++;
            if (a[i] < 0)
                negative++;
            if (a[i] == 0)
                zeroNumbers++;
        }

        System.out.println("Negative = " + negative);
        System.out.println("Positive = " + positive);
        System.out.println("Number of zeros = " + zeroNumbers);
    }
}
