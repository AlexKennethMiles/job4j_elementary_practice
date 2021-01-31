package ru.job4j.condition;

public class SwitchWeek {
    public static String nameOfDay(int day) {
        return switch (day) {
            case 1 -> "Понедельник";
            case 2 -> "Вторник";
            case 3 -> "Среда";
            case 4 -> "Четверг";
            case 5 -> "Пятница";
            case 6 -> "Суббота";
            case 7 -> "Воскресенье";
            default -> "Ошибка";
        };
    }

    public static void main(String[] args) {
        System.out.println(nameOfDay(1));
        System.out.println(nameOfDay(3));
        System.out.println(nameOfDay(7));
        System.out.println(nameOfDay(8));
    }
}
