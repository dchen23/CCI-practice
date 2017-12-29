package ch01_q07;

import CCILibrary.AssortedMethods;

public class Question {

    public static void rotate(int[][] matrix) {

        int layer = matrix.length / 2;

        for (int i = 0; i < layer; i++) {
            for (int j = i; j < (matrix.length - 1 - i); j++) {

                int top = matrix[i][j];
                int border = matrix.length - 1 - i;
                int offset = border - j;
                // right -> top
                matrix[i][j] = matrix[j][border];
                // bottom -> right
                matrix[j][border] = matrix[border][offset];
                // left -> bottom
                matrix[border][offset] = matrix[offset][i];
                // top -> left
                matrix[offset][i] = top;
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = AssortedMethods.randomMatrix(5, 5, 0, 9);
        AssortedMethods.printMatrix(matrix);
        rotate(matrix);
        System.out.println();
        AssortedMethods.printMatrix(matrix);
    }
}
