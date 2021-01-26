package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        boolean flag = left >= right;
        int result = flag ? left : right;
        return result;
    }

    public static void main(String[] args) {
        System.out.println(max(1,2));
        System.out.println(max(2,0));
        System.out.println(max(-1,2));
        System.out.println(max(1,1));
    }
}
