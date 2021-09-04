package ru.vorobyov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
    один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
    дополнительный массив.*/

    public static void main(String[] args) {
        System.out.println("Print the number of elements of the first and second arrays and K)");
        Scanner sc = new Scanner(System.in);

        int n = 10;
        int nSecond = 5;
        int k = 2;

        var a = new int[n + nSecond];
        var b = new int[nSecond];

        for (int i = 0; i < n; i++)
            a[i] = (int) (Math.random() * a.length) + 1;

        System.out.println(Arrays.toString(a));

        for(int i = a.length - 1; i != n - k - 2; i--){
            a[i] = a[i - nSecond];
        }

        System.out.println(Arrays.toString(a));

        for (int i = 0; i < b.length; i++){
            b[i] = (int) (Math.random() * a.length) + 1;
            a[k + i] = b[i];
        }

        System.out.println(Arrays.toString(b));

        System.out.println(Arrays.toString(a));
    }

}
