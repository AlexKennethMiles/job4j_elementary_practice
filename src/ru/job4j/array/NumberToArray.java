package ru.job4j.array;

import java.util.Arrays;

public class NumberToArray {
    public static int[] resolve(int number) {
        int[] rsl = new int[1];
        int size = rsl.length;
        while (number > 0) {
            rsl = Arrays.copyOf(rsl, size);
            rsl[size - 1] = number % 10;
            number = number / 10;
            size++;
        }
        return rsl;
    }
}
