package ru.vorobyov;

import java.util.ArrayList;
import java.util.Scanner;

public class Ninth {
    /*В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
    чисел несколько, то определить наименьшее из них*/
    Ninth(){
        System.out.println("Print numbers(N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        ArrayList<Integer> mathFashion = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * i);
        }
    }
}
