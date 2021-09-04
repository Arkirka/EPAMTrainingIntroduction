package ru.vorobyov;

import java.util.Random;
import java.util.Scanner;

public class Sixth {
    //TODO 7-10
    /*Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
являются простыми числами*/
    Sixth(){
        System.out.println("Print number (N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double sum = .0;

        double[] a = new double[n];

        for (int i = 0; i < n; i++) {
            a[i] = Math.random() * n;
        }

        System.out.print("Simple numbers: 1 2 ");
        sum += a[1] + a[2];

        for (int i = 0; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0)
                    break;
                else if(j == i - 1){
                    sum += a[i];
                    System.out.print(i + " ");
                }
            }
        }

        System.out.println();
        System.out.println("Sum = " + sum);
    }
}
