package ru.job4j.array;

public class UnionThreeArrays {
    public static int[] union(int[] left, int[] middle, int[] right) {
        int[] rsl = new int[2 + middle.length];
        rsl[0] = left[0];
        rsl[rsl.length - 1] = left[left.length - 1];
        for (int i = 0; i < rsl.length - 2; i++) {
            if (i % 2 != 0) {
                rsl[i + 1] = middle[i];
            } else {
                rsl[i + 1] = right[i];
            }
        }
        return rsl;
    }
}
