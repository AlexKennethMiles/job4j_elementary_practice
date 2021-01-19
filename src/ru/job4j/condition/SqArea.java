package ru.job4j.condition;

public class SqArea {
    public static double square(int p, int k) {
        double h = (double) p / (2 * (k + 1));
        //System.out.println(h);
        double l = h * k;
        //System.out.println(L);
        return l * h;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println(" p = 4, k = 1, s = 1, realSq = " + result1);
        double result2 = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, realSq = " + result2);
        double result3 = SqArea.square(25, 4);
        System.out.println(" p = 25, k = 4, s = 25, realSq = " + result3);
    }
}
