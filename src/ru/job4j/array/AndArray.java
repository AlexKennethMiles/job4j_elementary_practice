package ru.job4j.array;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[0];
        int count = 1;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    rsl = Arrays.copyOf(rsl, count);
                    rsl[count - 1] = left[i];
                    count++;
                }
            }
        }
        return rsl;
    }
}
