package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;

public class Second {
   /*Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали*/

    public Second(){
        int[][] a = new int[6][6];
        int secondIterator = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }

        new ArrayPrint().printAllArray(a);

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i][secondIterator]);
            secondIterator++;
        }
    }
}
