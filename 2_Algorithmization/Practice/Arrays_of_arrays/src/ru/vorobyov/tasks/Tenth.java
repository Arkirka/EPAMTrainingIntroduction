package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.ArrayList;
import java.util.Arrays;

public class Tenth {
    /*Найти положительные элементы главной диагонали квадратной матрицы.*/
    public Tenth(){
        int[][] a = new int[6][6];
        int secondIterator = 0;
        var positiveElements = new ArrayList<Integer>();

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int) (Math.random() * (i+10) - ((i+10)/2));
        }

        new ArrayPrint().printAllArray(a);

        for (int i = 0; i < a.length; i++) {
            if(a[i][secondIterator] > 0)
                positiveElements.add(a[i][secondIterator]);
            secondIterator++;
        }

        System.out.println("Positive elements on main diagonal: ");
        for (int element:
             positiveElements) {
            System.out.print(element + ", ");
        }
    }
}
