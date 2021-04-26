package ru.vorobyov;

import java.util.Scanner;

public class Fourth {
    /*Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и целой частях). Поменять местами
    дробную и целую части числа и вывести полученное значение числа.*/

    Fourth(){
        System.out.println("Print 5 numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();

        if( a * b > x * y || a * b > y * z || a * b > x * z)
            System.out.println("The brick will pass through the hole");
        else
            System.out.println("The brick will not pass through the hole");

    }
}
