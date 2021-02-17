package ru.job4j.array;

public class MaxLengthSeries {
    public static int find(int[] array) {
        int maxLength = 1;
        int localMax = 1;
        for (int i = 1; i < array.length; i++) {
            if (array[i] >= array[i - 1]) {
                localMax++;
            } else {
                localMax = 1;
            }
            if (localMax > maxLength) {
                maxLength = localMax;
            }
        }
        return maxLength;
    }
}
