package ru.job4j.array;

public class SwapCols {
    public static void swap(int[][] data, int src, int dst) {
        int buf;
        for (int i = 0; i < data.length; i++) {
            buf = data[i][src];
            data[i][src] = data[i][dst];
            data[i][dst] = buf;
        }
    }
}
