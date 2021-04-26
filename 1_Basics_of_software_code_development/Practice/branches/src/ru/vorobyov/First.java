package ru.vorobyov;

import java.util.Scanner;

public class First {
    /*Найдите значение функции: z = ( (a – 3 ) * b / 2) + c*/
     First(){
        System.out.println("Print 2 angles");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a + b < 180){
            System.out.println("This triangle can exist");
            if(a == 90 || b == 90|| a+b == 90) {
                System.out.println("This triangle is rectangular");
            }
        } else{
            System.out.println("This triangle can't exist");
        }

    }
}
