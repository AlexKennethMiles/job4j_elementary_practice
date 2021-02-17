package ru.job4j.array;

public class SummingPrevious {
    public static int[] calculate(int a, int b, int n) {
        int[] rsl = new int[n];
        rsl[0] = a;
        rsl[1] = b;
        rsl[2] = a + b;
        for (int i = 3; i < n; i++) {
            rsl[i] = rsl[i - 1] * 2;
        }
        return rsl;
    }
}
