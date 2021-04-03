package ru.vorobyov;

import java.util.Scanner;

public class Third {
    /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
            ((sinx + cosy) / (cosx - siny)) * tgxy*/
    Third(){
        System.out.println("Print 2 numbers");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();

        double z = ((Math.sin(a) + Math.cos(b)) / (Math.cos(a) - Math.sin(b))) * (Math.tan(a*b));

        System.out.println(z);
    }
}
