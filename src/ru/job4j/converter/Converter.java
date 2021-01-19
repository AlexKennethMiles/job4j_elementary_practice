package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        System.out.println("===");
        int dollar = Converter.rubleToDollar(240);
        System.out.println("240 rubles are " + dollar + " dollar.");
        System.out.println("===");
        int ruble = Converter.dollarToRuble(15);
        System.out.println("15 dollars are " + ruble + " ruble.");
        ruble = Converter.euroToRuble(5);
        System.out.println("5 euro are " + ruble + " ruble.");
        // Since we work with int, we will not be able to transfer from dollars to euros and vice versa.
    }

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static int euroToRuble(int value) {
        int rsl = value * 70;
        return rsl;
    }

    public static int dollarToRuble(int value) {
        int rsl = value * 60;
        return rsl;
    }
}