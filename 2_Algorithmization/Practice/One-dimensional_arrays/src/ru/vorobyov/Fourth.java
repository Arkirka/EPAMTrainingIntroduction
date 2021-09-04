package ru.vorobyov;

import java.util.Scanner;

public class Fourth {
    /*. Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.*/

    Fourth(){
        System.out.println("Print numbers(N and elements of array)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int minPos = 0;
        int maxPos = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] > max){
                max = a[i];
                maxPos = i;
            }
            if(a[i] < min){
                min = a[i];
                minPos = i;
            }
        }

        a[minPos] = max;
        a[maxPos] = min;


        for (int i = 0; i < n; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
    }
}
