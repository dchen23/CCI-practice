package ch01_q08;

import CCILibrary.AssortedMethods;

import java.util.Arrays;

public class Question {

    public static void setZeros(int[][] matrix) {
        
        boolean[] rows = new boolean[matrix.length];
        boolean[] columns = new boolean[matrix[0].length];
        Arrays.fill(rows, Boolean.FALSE);
        Arrays.fill(columns, Boolean.FALSE);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    columns[j] = true;
                }
            }
        }

        zeroOutRow(matrix, rows);
        zeroOutColumn(matrix, columns);
    }

    public static void zeroOutRow(int[][] matrix, boolean[] rows) {
        for (int i = 0; i < rows.length; i++) {
            if (rows[i]) {
                for (int j = 0; j < matrix[0].length; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    public static void zeroOutColumn(int[][] matrix, boolean[] columns) {
        for (int i = 0; i < columns.length; i++) {
            if (columns[i]) {
                for (int j = 0; j < matrix.length; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
    }

    public static void main(String[] args) {
        int nrows = 5;
        int ncols = 10;
        int[][] matrix = AssortedMethods.randomMatrix(nrows, ncols, -10, 10);

        AssortedMethods.printMatrix(matrix);

        setZeros(matrix);

        System.out.println();

        AssortedMethods.printMatrix(matrix);
    }
}
