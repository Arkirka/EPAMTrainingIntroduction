package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;
import java.util.Scanner;

public class First {
    /*.Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.*/

     public First(){
         System.out.println("Print 2 numbers(n1 and n2)");
         Scanner sc = new Scanner(System.in);

         int n1 = sc.nextInt();
         int n2 = sc.nextInt();

         int a[][] = new int[n1][n2];

         for (int i = 0; i < n1; i++) {
             for (int j = 0; j < n2; j++)
                 a[i][j] = (int) (Math.random() * (i+10));
         }

         new ArrayPrint().printAllArray(a);

         for (int i = 0; i < n1; i++) {
             if (a[0][i] > a[n2 - 1][i] && i % 2 != 0){
                 System.out.println("Column: " + i);
                 new ArrayPrint().printColumn(a, i);
             }
         }
    }




}
