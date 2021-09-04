package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.ArrayList;
import java.util.Arrays;

public class Eleventh {
    /*Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
    которых число 5 встречается три и более раз.*/
    public Eleventh(){
        int[][] a = new int[10][20];
        var rowNums = new ArrayList<Integer>();
        var counter = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++)
                a[i][j] = (int) (Math.random() * 15);
        }

        new ArrayPrint().printAllArray(a);

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++){
                if(a[i][j] == 5)
                    counter++;
            }
            if(counter >= 3)
                rowNums.add(i);
            counter = 0;
        }

        System.out.println("№-s of rows: ");

        for (int element:
             rowNums) {
            System.out.print(element + ", ");
        }
    }
}
