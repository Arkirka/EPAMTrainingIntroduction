package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Scanner;

public class Fourteenth {
    /*Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
    единиц равно номеру столбца.*/
    public Fourteenth(){
        int m = (int) (Math.random() * 20+5);
        int n = (int) (Math.random() * 20+5);

        Integer[][] a = new Integer[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++){
                if(j > i)
                    a[i][j] = 1;
                else
                    a[i][j] = 0;
            }

        }
        new ArrayPrint().printAllArray(a);
    }
}
