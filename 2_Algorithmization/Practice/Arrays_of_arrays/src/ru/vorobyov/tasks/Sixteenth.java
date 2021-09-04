package ru.vorobyov.tasks;

import ru.vorobyov.utilities.ArrayPrint;

import java.util.Arrays;

public class Sixteenth {
    /*Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,...,
    n^2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
    собой. Построить такой квадрат.*/
    public Sixteenth(){
        new ArrayPrint().printAllArray(magicSquare(5));
    }

    private int[][] magicSquare(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(matrix[i], 0);
        }
        int count = 1, y = 0, x = matrix.length/2;
        while (true){
            matrix[y][x] = count;

            count++;
            if (((y == 0) && (x >= n-1)) && (matrix[n-1][0] != 0)){
                y++;
            }
            else {
                y--;
                if (y < 0) {
                    y = n - 1;
                }
                x++;
                if (x == n) {
                    x = 0;
                }
                if(matrix[y][x]!=0){
                    y+=2;
                    x--;
                }
            }

            if(count==n*n+1) break;
        }
        return matrix;
    }
}
