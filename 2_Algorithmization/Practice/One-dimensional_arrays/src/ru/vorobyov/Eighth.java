package ru.vorobyov;

import java.util.ArrayList;
import java.util.Scanner;

public class Eighth {
    /*Дана последовательность целых чисел a(1), a(2)....a(n). Образовать новую последовательность, выбросив из
    исходной те члены, которые равны min(a(1), a(2)....a(n)).*/
    Eighth(){
        System.out.println("Print number (N)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;

        int[] a = new int[n];
        ArrayList<Integer> aList = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            a[i] = (int) (Math.random() * i);
            if(a[i] < min)
                min = a[i];
        }
        System.out.print("Old sequence: ");
        for (int el:
             a) {
            System.out.print(el + " ");
        }

        for (int i = 0; i < n; i++) {
            if(a[i] == min)
                continue;
            else
                aList.add(a[i]);
        }

        System.out.println();
        System.out.print("New sequence: ");
        for (int el:
                aList) {
            System.out.print(el + " ");
        }

    }
}
