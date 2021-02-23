package ru.job4j.array;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = right.length == 0 ? left : left.length == 0 ? right : Arrays.equals(left, right) ? new int[0] : new int[1];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] != right[j] && Arrays.binarySearch(right, left[i]) <= -1) {
                    count++;
                    rsl = Arrays.copyOf(rsl, count);
                    rsl[count - 1] = left[i];
                    break;
                }
            }
        }
        for (int i = 0; i < right.length; i++) {
            if (Arrays.binarySearch(left, right[i]) < -1) {
                count++;
                rsl = Arrays.copyOf(rsl, count);
                rsl[count - 1] = right[i];
            }
        }
        return rsl;
    }
}
