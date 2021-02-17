package ru.job4j.array;

public class SwapRows {
    public static void swap(int[][] data, int src, int dst) {
        int buf;
        for (int i = 0; i < data[src].length; i++) {
            buf = data[src][i];
            data[src][i] = data[dst][i];
            data[dst][i] = buf;
        }
    }
}
