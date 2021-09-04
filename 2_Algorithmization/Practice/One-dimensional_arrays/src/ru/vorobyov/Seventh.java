package ru.vorobyov;

import java.util.Scanner;

public class Seventh {
    /*Даны действительные числа a(1), a(2)....a(n). Найти
    max(a(1) + a(2n), a(2) + a(2n-1), ..., a(n) + a(n+1)).*/
    Seventh(){
        System.out.println("Print number (N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double maxSum = Double.MIN_VALUE;
        double tempSum = 0;

        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * n;
            System.out.print("a[" + i + "] = " + a[i] + "; ");
        }

        for (int i = 0; i < a.length / 2; i++) {
            tempSum = a[i] + a[a.length - i - 1];
            if(tempSum > maxSum)
                maxSum = tempSum;
        }

        System.out.println();
        System.out.println("Max sum = " + maxSum);
    }
}
