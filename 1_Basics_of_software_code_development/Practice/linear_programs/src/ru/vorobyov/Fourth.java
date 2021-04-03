package ru.vorobyov;

import java.util.Scanner;

public class Fourth {
    /*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.*/

    Fourth(){
        System.out.println("Print number");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double remainder = a % 1 * 1000;
        double numerator = (a - a % 1) / 1000;

        double z = Math.round(remainder) + numerator;

        System.out.println(z);
    }
}
