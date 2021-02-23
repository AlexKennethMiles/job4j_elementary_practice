package ru.job4j.array;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = right.length == 0 ? left : new int[left.length != 0 ? 1 : 0];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] != right[j]) {
                    count++;
                    rsl = Arrays.copyOf(rsl, count);
                    rsl[count - 1] = left[i];
                }
            }
        }
        return rsl;
    }
}
