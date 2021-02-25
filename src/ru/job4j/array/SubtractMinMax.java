package ru.job4j.array;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int min = 2_147_483_647, max = -2_147_483_648;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
            if (ints[i] >= max) {
                max = ints[i];
            }
        }
        return max - min;
    }
}
