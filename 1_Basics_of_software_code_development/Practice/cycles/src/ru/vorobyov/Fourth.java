package ru.vorobyov;

import java.math.BigInteger;
import java.util.Scanner;

public class Fourth {
    /*Составить программу нахождения произведения квадратов первых двухсот чисел*/

    Fourth(){
        BigInteger z = BigInteger.valueOf(1);

        for(int i = 2; i < 201; i++) {
            z = z.multiply(BigInteger.valueOf((long) i * i));
        }

        System.out.println(z);
    }
}
