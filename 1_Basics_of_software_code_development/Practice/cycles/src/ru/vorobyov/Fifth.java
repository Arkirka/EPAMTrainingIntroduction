package ru.vorobyov;

import java.util.ArrayList;
import java.util.Scanner;

public class Fifth {
   /* Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
    заданному е. Общий член ряда имеет вид:
        a(n) = 1/2^n + 1/3^n
    */
    Fifth(){
        System.out.println("Print number(e)");
        Scanner sc = new Scanner(System.in);

        double e = sc.nextDouble();
        double an = 1;
        double n = 1;
        double sum = 1;

        while (!(sum >= e)){
            an = (1 / Math.pow(2 , n)) + (1 / Math.pow(3, n));
            sum += an;
            n++;
        }

        System.out.println("Sum = " + sum);
    }
}
