package ru.vorobyov;

import java.util.Scanner;

public class Second {
    /*Вычислить значения функции на отрезке [а,b] c шагом h:
      y = {x, x > 2
          {x, x <= 2
     */

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
