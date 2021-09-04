package ru.vorobyov;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Choose task (print 1, 2 and etc)");
        Scanner sc = new Scanner(System.in);

        int task = sc.nextInt();

        switch (task){
            case 1:
                new First();
                break;
            case 2:
                new Second();
                break;
            case 3:
                new Third();
                break;
            case 4:
                new Fourth();
                break;
            case 5:
                new Fifth();
                break;
            case 6:
                new Sixth();
                break;
            case 7:
                new Seventh();
                break;
            case 8:
                new Eighth();
                break;
            case 9:
                new Ninth();
                break;
            case 10:
                new Tenth();
                break;
        }
    }
}
