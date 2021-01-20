package ru.job4j.converter;

public class Converter {
    public static void main(String[] args) {
        int in = 140;
        int expected = 2;
        int euro = Converter.rubleToEuro(in);
        boolean testStatus = euro == expected;
        System.out.println("140 rubles are " + euro + " euro. Test status : " + testStatus + '.');
        System.out.println("===");
        in = 240;
        expected = 4;
        int dollar = Converter.rubleToDollar(in);
        testStatus = dollar == expected;
        System.out.println("240 rubles are " + dollar + " dollar. Test status : " + testStatus + '.');
        System.out.println("===");
        in = 15;
        expected = 900;
        int ruble = Converter.dollarToRuble(in);
        testStatus = ruble == expected;
        System.out.println("15 dollars are " + ruble + " ruble. Test status : " + testStatus + '.');
        in = 5;
        expected = 350;
        ruble = Converter.euroToRuble(in);
        testStatus = ruble == expected;
        System.out.println("5 euro are " + ruble + " ruble. Test status : " + testStatus + '.');
        // Since we work with int, we will not be able to transfer from dollars to euros and vice versa.
    }

    public static int rubleToEuro(int value) {
        return value / 70;
    }

    public static int rubleToDollar(int value) {
        return value / 60;
    }

    public static int euroToRuble(int value) {
        return value * 70;
    }

    public static int dollarToRuble(int value) {
        return value * 60;
    }
}
