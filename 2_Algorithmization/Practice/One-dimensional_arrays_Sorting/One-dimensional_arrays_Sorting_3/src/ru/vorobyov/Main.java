package ru.vorobyov;

import java.util.Arrays;

public class Main {

    /*Сортировка выбором. Дана последовательность чисел
    a1 <= a2 <= ... <= an.
    Требуется переставить элементы так,
    чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
    элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
    повторяется. Написать алгоритм сортировки выбором*/

    public static void main(String[] args) {
        int first = 0;
        int max = 0;
        int maxIndex = 0;

        var a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < a.length; i++){
            first = a[i];
            max = 0;
            maxIndex = 0;
            for(int j = i; j < a.length; j++){
                if(max < a[j]){
                    max = a[j];
                    maxIndex = j;
                }
            }
            if(maxIndex != 0) {
                a[i] = max;
                a[maxIndex] = first;
            }
        }

        System.out.println(Arrays.toString(a));

    }

}
