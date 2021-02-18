package ru.job4j.array;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            count += array[i].length;
        }
        int size = (int) (Math.ceil(Math.sqrt(count)));
        int[][] rsl = new int[size][size];
        int y = 0, x = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl[y][x] = array[i][j];
                if (x == size - 1) {
                    y++;
                    x = 0;
                } else {
                    x++;
                }
            }
        }
        return rsl;
    }
}
