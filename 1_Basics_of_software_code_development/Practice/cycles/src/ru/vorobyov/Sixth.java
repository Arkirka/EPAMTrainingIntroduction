package ru.vorobyov;

import java.util.Scanner;

public class Sixth {
   /* Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера*/

    //TODO 6,7,8
    Sixth(){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 128; i++){
            char symbol = (char) i;
            System.out.println(symbol + " = " + i);
        }

    }
}
