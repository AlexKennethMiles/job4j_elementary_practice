package ru.job4j.array;

public class IndexOfWithCount {
    public static int indexOf(char[] string, char c, int number) {
        int rsl = -1;
        int count = number;
        for (int i = 0; i < string.length; i++) {
            if (string[i] == c) {
                count--;
                if (count == 0) {
                    rsl = i;
                    break;
                }
            }
        }
        return rsl;
    }
}
