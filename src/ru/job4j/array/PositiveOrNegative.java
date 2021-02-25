package ru.job4j.array;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        boolean rsl = false;
        int countN = 0;
        int countP = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] < 0) {
                countN++;
            } else if (data[i] > 0) {
                countP++;
            }
        }
        if (countN % 2 != 0) {
            rsl = true;
        }
        if (countP % 2 == 0) {
            rsl = false;
        }
        return rsl;
    }
}
