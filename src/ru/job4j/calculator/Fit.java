package ru.job4j.calculator;

public class Fit {
    public static void main(String[] args) {
        short heightM = 187;
        short heightW = 170;
        double man = Fit.manWeight(heightM);
        double woman = Fit.manWeight(heightW);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 170 is " + woman);
    }

    public static double manWeight(short height) {
        double rsl = (height - 100) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }
}
