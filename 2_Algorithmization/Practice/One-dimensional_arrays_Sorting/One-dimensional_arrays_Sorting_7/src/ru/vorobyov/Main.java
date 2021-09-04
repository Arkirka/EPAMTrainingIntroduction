package ru.vorobyov;

import java.util.Arrays;

public class Main {

    /*Пусть даны две неубывающие последовательности действительных чисел
    a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm.
    Требуется указать те места, на которые нужно вставлять элементы последовательности
    b1 <= b2 <= ... <= bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.*/

    public static void main(String[] args) {

        var a = new int[]{1, 6, 9, 15, 19, 24, 30, 36, 39, 41};
        var b = new int[]{3, 6, 10, 17, 21, 25, 33, 38, 40};
        int index = 0;
        boolean flag;

        for(int i = 0; i < b.length; i++){
            flag = true;
            while (flag){
                if(b[i] > a[index])
                    index++;
                else {
                    flag = false;
                    int secIndex = index - 1;
                    System.out.println("b[" + i + "] - between " + secIndex+ " and " + index);
                }
            }

        }

    }

}
