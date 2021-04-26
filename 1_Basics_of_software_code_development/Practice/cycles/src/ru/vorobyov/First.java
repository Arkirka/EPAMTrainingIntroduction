package ru.vorobyov;

import java.util.Scanner;

public class First {
   /* Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует
    все числа от 1 до введенного пользователем числа.*/
     First(){
        System.out.println("Print number");
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int z = 0;

        for(int i = 0; i < a + 1; i++){
            z += i;
        }

        System.out.println(z);
    }
}
