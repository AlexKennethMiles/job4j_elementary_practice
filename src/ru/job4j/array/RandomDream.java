package ru.job4j.array;

public class RandomDream {
    public static String random(String[] prizes, int num) {
        int remainder = num % prizes.length;
        int index = remainder > 0 ? remainder - 1 : remainder - 1 + prizes.length;
        return prizes[index];
    }
}
