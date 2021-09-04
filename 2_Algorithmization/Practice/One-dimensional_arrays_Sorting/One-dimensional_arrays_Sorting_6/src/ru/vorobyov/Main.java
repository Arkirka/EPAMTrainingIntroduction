package ru.vorobyov;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    /* Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
    Делается это следующим образом: сравниваются два соседних элемента
    ai и ai+1. Если ai <= ai+1, то продвигаются
    на один элемент вперед.
    Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
    Составить алгоритм этой сортировки*/

    public static void main(String[] args) {

        var a = new int[]{8, 10, 2, 4, 2, 7, 9, 0, 1, 5};
        int temp = 0;

        a = ShellSort(a.length, a);

        System.out.println(Arrays.toString(a));

    }

    static int[] ShellSort(int n, int a[])
    {
        int step, j;
        int tmp;
        for (step = n / 2; step > 0; step /= 2)
            for (int i = step; i < n; i++)
            {
                tmp = a[i];
                for (j = i; j >= step; j -= step)
                {
                    if (tmp < a[j - step])
                        a[j] = a[j - step];
                    else
                        break;
                }
                a[j] = tmp;
            }

        return a;
    }


}
