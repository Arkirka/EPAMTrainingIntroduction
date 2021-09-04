package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class Eighth {
    /*В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить
    на соответствующие им позиции другого, а его элементы второго переместить в первый. Номера столбцов вводит
    пользователь с клавиатуры*/
    public Eighth(){
        System.out.println("Print numbers (N and 2 №-s of columns)");
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int firstColumn = sc.nextInt();
        int secondColumn = sc.nextInt();
        int temp = 0;

        int[][] a = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++)
                a[i][j] = (int) (Math.random() * (i+10));
        }
         //TODO

        System.out.println("Array before shift:");
        new ArrayPrint().printAllArray(a);

        for(int i = 0; i < n; i++){
            temp = a[i][firstColumn];
            a[i][firstColumn] = a[i][secondColumn];
            a[i][secondColumn] = temp;
        }

        System.out.println("Array after shift:");
        new ArrayPrint().printAllArray(a);
    }

}
