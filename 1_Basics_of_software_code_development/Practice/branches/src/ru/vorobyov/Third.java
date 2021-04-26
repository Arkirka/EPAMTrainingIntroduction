package ru.vorobyov;

import java.util.Scanner;

public class Third {
    /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
            ((sinx + cosy) / (cosx - siny)) * tgxy*/
    Third(){
        System.out.println("Print 6 numbers(3 coordinates)");
        Scanner sc = new Scanner(System.in);

        int x1 = sc.nextInt();
        int y1 = sc.nextInt();

        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        int x3 = sc.nextInt();
        int y3 = sc.nextInt();

        if ((x1 - x2) / (x3 - x2) == (y1 - y2) / (y3 - y2))
            System.out.println("These points are not located on the same straight line");
        else
            System.out.println("These points are located on the same straight line");
    }
}
