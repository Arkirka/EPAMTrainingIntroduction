package ru.vorobyov;

import java.util.Scanner;

public class Seventh {
    /*Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
    m и n вводятся с клавиатуры.*/
    Seventh(){
        System.out.println("Print 2 natural number");
        Scanner sc = new Scanner(System.in);

        int m = sc.nextInt();
        int n = sc.nextInt();
        if(m <= 0){
            System.out.println("Print natural numbers");
            System.exit(1);
        }

        for(int i = m; i <= n; i++){
            System.out.println(i + " : ");
            for(int j = 2; j < i; j++){
                if(i % j == 0)
                    System.out.println(j + " ");
            }
        }

    }
}
