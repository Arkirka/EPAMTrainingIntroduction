package ru.vorobyov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /* Даны две последовательности
    a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Образовать из них новую последовательность
    чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать..*/

    public static void main(String[] args) {

        int n = 10;
        int m = 5;
        int k = 2;

        var a = new int[n + m];
        var b = new int[m];

        for (int i = 0; i < n; i++)
            a[i] = n - i;

        for (int i = 0; i < b.length; i++){
            b[i] = m - i;
        }

        System.out.println("First array:");
        System.out.println(Arrays.toString(a));
        System.out.println("Second array:");
        System.out.println(Arrays.toString(b));

        int iterator = 0;

        for (int i = 0; i < a.length; i++){

            if(a[i] < b[iterator]){
                a = new Main().arrayInsertElement(a, b[iterator], i);
                iterator++;
            }
            if(iterator == b.length)
                break;
        }

        System.out.println("Result array:");
        System.out.println(Arrays.toString(a));

    }

    private int[] arrayInsertElement(int[] a, int element, int position){
        int temp = a[position];

        a[position] = element;

        for (int i = a.length - 1; i > position; i--){
            a[i] = a[i - 1];
        }

        if(position == a.length - 1)
            return a;

        a[position + 1] = temp;
        return a;
    }

}
