package ru.job4j.array;

import java.util.Arrays;

public class CheckSumIndexes {
    public static int[] collectNewArray(int[][] data, int sum) {
        int newSize = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    data[i][j] = 0;
                }
                if (data[i][j] == 0) {
                    for (int k = j; k < data[i].length - 1; k++) {
                        data[i][k] = data[i][k + 1];
                    }
                    data[i] = Arrays.copyOf(data[i], data[i].length - 1);
                }
            }
            newSize += data[i].length;
        }
        int[] rsl = new int[newSize];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[count] = data[i][j];
                count++;
            }
        }
        return rsl;
    }
}
