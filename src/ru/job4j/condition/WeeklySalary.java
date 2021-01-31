package ru.job4j.condition;

public class WeeklySalary {
    public static int calculate(int[] hours) {
        int sum = 0;
        for (int i = 0; i < 5; i++) {
            if (hours[i] > 8) {
                sum = sum + ((hours[i] - 8) * 15) + 80;
            } else if (hours[i] > 0) {
                sum = sum + (hours[i] * 10);
            }
        }
        for (int i = 5; i < 7; i++) {
            if (hours[i] > 8) {
                sum = sum + (((hours[i] - 8) * 30) + 160);
            } else if (hours[i] > 0) {
                sum = sum + ((hours[i] * 10) * 2);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] hours = {10, 10, 10, 0, 8, 0, 0};
        int rsl = WeeklySalary.calculate(hours);
        System.out.println(rsl + " 410");
    }
}
