package ru.vorobyov;

import java.util.Scanner;

public class Third {
    /*Найти сумму квадратов первых ста чисел*/
    Third(){
        int z = 0;

        for(int i = 0; i < 101; i++){
            z += i * i;
        }

        System.out.println(z);
    }
}
