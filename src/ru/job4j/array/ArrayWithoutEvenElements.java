package ru.job4j.array;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] rsl = new int[data.length];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 != 0) {
                rsl[count] = data[i];
                count++;
            }
        }
        rsl = Arrays.copyOf(rsl, count);
        return rsl;
    }
}
