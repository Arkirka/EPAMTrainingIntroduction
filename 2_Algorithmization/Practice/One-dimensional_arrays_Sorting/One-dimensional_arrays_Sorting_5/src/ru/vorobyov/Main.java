package ru.vorobyov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /*. Сортировка вставками. Дана последовательность чисел
    a1, a2,..., an. Требуется переставить числа в порядке возрастания. Делается это следующим образом.
    Пусть a1, a2,..., an - упорядоченная последовательность, т. е. a1 <= a2 <= ... <= an.
    Берется следующее число a(i+1)
    и вставляется в последовательность так, чтобы новая
    последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i+1 до n
    не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
    с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции..*/

    public static void main(String[] args) {

        var a = new int[]{10,5 ,2 ,7, 16, 1, 9, 5};
        var b = new int[a.length];
        int currentElement = 0;

        b[0] = a[0];

        for(int i = 0; i < a.length - 1; i++){
            int index = binarySearch(b, a[i+1], 0, i+1);
            currentElement = a[i+1];

            b = stepToRight(b, index);
            b[index] = currentElement;
        }

        System.out.println(Arrays.toString(b));
    }

    static int[] stepToRight(int[] a, int index){
        for(int i = a.length - 1; i > index ; i--){
            a[i] = a[i - 1];
        }
        return a;
    }

    static int binarySearch(int[] a, int key, int low, int high) {
        int index = 0;
        int mid = 0;
        while (low <= high) {
            mid = (low + high) / 2;
            if (a[mid] < key) {
                low = mid + 1;
            } else if (a[mid] > key) {
                high = mid - 1;
            } else if (a[mid] == key) {
                break;
            }
        }
        index = mid;
        return index;
    }

}
