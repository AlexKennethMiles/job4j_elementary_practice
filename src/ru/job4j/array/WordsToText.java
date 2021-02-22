package ru.job4j.array;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length - 1; i++) {
            result += words[i] + ' ';
        }
        result += words[words.length - 1];
        return result;
    }
}
