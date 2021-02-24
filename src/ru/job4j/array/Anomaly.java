package ru.job4j.array;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[0][0];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up) {
                count++;
                if (count == 1) {
                    result = Arrays.copyOf(result, 1);
                    result[0] = new int[2];
                    result[0][0] = i;
                }
                result[0][1] = i;
            }
        }
        count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down) {
                count++;
                if (count == 1) {
                    result = Arrays.copyOf(result, 2);
                    result[1] = new int[2];
                    result[1][0] = i;
                }
                result[1][1] = i;
            }
        }
        return result;
    }
}
