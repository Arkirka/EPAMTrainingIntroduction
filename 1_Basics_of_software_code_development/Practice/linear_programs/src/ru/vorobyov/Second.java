package ru.vorobyov;

import java.util.Scanner;

public class Second {
   /*Вычислить значение выражения по формуле (все переменные принимают действительные значения):
            ((b + (b^2 + 4ac)^(1/2)) / 2a) - a^3c + b^-2*/

    Second(){
        System.out.println("Print 3 numbers");
        Scanner sc = new Scanner(System.in);

        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        double z = ((b + Math.sqrt(b*b + 4 * a * c)) / (2 * a) - (a*a*a * c) + (1/(b*b)));

        System.out.println(z);
    }
}
