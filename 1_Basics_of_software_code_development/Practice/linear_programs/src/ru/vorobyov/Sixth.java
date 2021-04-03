package ru.vorobyov;

import java.util.Scanner;

public class Sixth {
    /*Для данной области составить линейную программу, которая печатает true, если точка с координатами (х, у)
    принадлежит закрашенной области, и false — в противном случае:
            (изображение)*/
    Sixth(){
        System.out.println("Print 2 numbers (x and y)");
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();

        boolean isInArea = false;

        if(y > 0){
            if(y <= 4){
                if(x <= 2 && x >= -2)
                    isInArea = true;
            }
        } else{
            if(y >= -3){
                if(x <= 4 && x >= -4)
                    isInArea = true;
            }
        }

        System.out.println(isInArea);
    }
}
