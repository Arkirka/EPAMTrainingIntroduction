package ru.vorobyov;

import java.util.Scanner;

public class Fifth {
    /*Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i */
    Fifth(){
        System.out.println("Print numbers(N and elements of array)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            if (a[i] > i)
                System.out.println("a[" + i + "] = " + a[i]);
        }

    }
}
