package ru.job4j.array;

import static java.lang.Math.abs;

public class NoConsecutive {
    public static int find(int[] data) {
        int result = -1;
        for (int i = 1; i < data.length; i++) {
            if (Math.abs(data[i] - data[i - 1]) != 1) {
                result = data[i];
                break;
            }
        }
        return result;
    }
}
