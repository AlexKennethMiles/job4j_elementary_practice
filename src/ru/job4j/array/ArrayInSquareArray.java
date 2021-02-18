package ru.job4j.array;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) (Math.ceil(Math.sqrt(array.length)));
        int[][] rsl = new int[size][size];
        int count = 0;
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                if (count > array.length - 1) {
                    rsl[i][j] = 0;
                } else {
                    rsl[i][j] = array[count];
                }
                count++;
            }
        }
        return rsl;
    }
}
