package ru.job4j.array;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] rsl = left.length > 0 ? left : right;
        int count = rsl.length;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (rsl[i] != right[j] && Arrays.binarySearch(rsl, right[j]) < -1) {
                    count++;
                    rsl = Arrays.copyOf(rsl, count);
                    rsl[count - 1] = right[j];
                }
            }
        }
        return rsl;
    }
}
