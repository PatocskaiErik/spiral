package com.epam.rd.autotasks;

class Spiral {
    static int[][] spiral(int rows, int columns) {
        int[][] matrix = new int[rows][columns];

        int num = 1;
        int topRow = 0;
        int bottomRow = rows - 1;
        int leftColumn = 0;
        int rightColumn = columns - 1;

        while(topRow <= bottomRow && leftColumn <= rightColumn) {
            for(int i = leftColumn; i <= rightColumn; i++) {
                matrix[topRow][i] = num++;
            }
            topRow++;

            for(int i = topRow; i<= bottomRow; i++) {
                matrix[i][rightColumn] = num++;
            }
            rightColumn--;

            if(topRow <= bottomRow) {
                for(int i = rightColumn; i >= leftColumn; i--) {
                    matrix[bottomRow][i] = num++;
                }
                bottomRow--;
            }

            if(leftColumn <= rightColumn) {
                for(int i = bottomRow; i >= topRow; i--) {
                    matrix[i][leftColumn] = num++;
                }
                leftColumn++;
            }
        }
        return matrix;
    }
}
