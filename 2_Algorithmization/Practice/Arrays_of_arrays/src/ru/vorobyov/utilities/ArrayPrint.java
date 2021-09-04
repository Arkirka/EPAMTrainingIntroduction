package ru.vorobyov.utilities;

import java.util.Arrays;

public class ArrayPrint {

    public void printAllArray(int a[][]){
        for (int[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void printAllArray(Integer[][] a) {
        for (Integer[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void printColumn(int[][] array, int iter){
        for(int i = 0; i < array[iter].length; i++)
            System.out.println(array[i][iter]);
    }

    public void printRow(int[][] array, int iter){
        for(int i = 0; i < array.length; i++)
            System.out.println(array[iter][i]);
    }

    public void printAllArray(byte[][] a){
        for (byte[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }

    public void printAllArray(double[][] a){
        for (double[] row : a) {
            System.out.println(Arrays.toString(row));
        }
    }
}
