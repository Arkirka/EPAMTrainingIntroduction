package ru.vorobyov;

import java.util.Arrays;

public class Main {

    /*Сортировка обменами. Дана последовательность чисел
    a1 >= a2 >= ... >= an.
    Требуется переставить числа в порядке возрастания. Для этого сравниваются два соседних числа
    ai и ai+1.
    Если ai > ai+1, то делается
    перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
    Составить алгоритм сортировки, подсчитывая при этом количества перестановок.*/

    public static void main(String[] args) {
        int first = 0;
        int max = 0;
        int maxIndex = 0;

        var a = new int[]{10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        a = sortInAscendingOrder(a);

        System.out.println(Arrays.toString(a));

    }

    static int[] sortInAscendingOrder(int[] a){
        boolean flag = true;
        int temp = 0;
        while (flag){
            flag = false;
            for (int i = 0; i < a.length - 1; i++){
                if(a[i] > a[i+1]){
                    flag = true;
                    temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
        return a;
    }

}
