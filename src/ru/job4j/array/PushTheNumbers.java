package ru.job4j.array;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                if (row == i && column - 1 == j) {
                    for (int k = 0; k < column; k++) {
                        array[row][k] = array[row][k + 1];
                    }
                } else if (row == i && column + 1 == j) {
                    for (int k = array[i].length - 1; k > column; k--) {
                        array[row][k] = array[row][k - 1];
                    }
                } else if (row - 1 == i && column == j) {
                    for (int k = 0; k < row; k++) {
                        array[k][column] = array[k + 1][column];
                    }
                } else if (row + 1 == i && column == j) {
                    for (int k = array.length - 1; k > row; k--) {
                        array[k][column] = array[k - 1][column];
                    }
                }
            }
        }
        array[row][column] = 0;
    }
}
