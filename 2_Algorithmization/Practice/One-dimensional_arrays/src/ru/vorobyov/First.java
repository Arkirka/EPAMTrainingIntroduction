package ru.vorobyov;

import java.util.Scanner;

public class First {
    /*. В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.*/
     First(){
        System.out.println("Print 2 number(N and K)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] a = new int[n];
        int sum = 0;

         for (int i = 0; i < n; i++) {
             a[i] = i;
         }

         for (int i = 0; i < n; i++) {
             if (a[i] % k == 0)
                 sum += a[i];
         }

        System.out.println("Sum = " + sum);
    }
}
