package ru.vorobyov;

import java.util.Scanner;

public class First {
    /*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c*/
     First(){
        System.out.println("Print 3 numbers");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int z = ((a - 3) * b / 2) + c;

        System.out.println(z);
    }
}
