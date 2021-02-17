package ru.job4j.array;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * right.length];
        int count = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < left.length; j++) {
                rsl[count] = Math.max(left[i][j], right[i][j]);
                count++;
            }
        }
        return rsl;
    }
}
