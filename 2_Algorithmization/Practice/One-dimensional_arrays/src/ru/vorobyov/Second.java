package ru.vorobyov;

import java.util.Scanner;

public class Second {
   /*Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
числом. Подсчитать количество замен*/

    Second(){
        System.out.println("Print 2 number(N and Z)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int z = sc.nextInt();
        int[] a = new int[n];
        int count = 0;

        for (int i = 0; i < n; i++) {
            a[i] = i;
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > z){
                a[i] = z;
                count++;
            }
        }

        System.out.println("Number of substitutions = " + count);
        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
