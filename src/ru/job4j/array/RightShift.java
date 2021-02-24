package ru.job4j.array;

public class RightShift {

    public static void shift(int[] nums, int count) {
        for (int i = 0; i < count; i++) {
            shift(nums);
        }
    }

    // One step
    private static void shift(int[] nums) {
        int buf = nums[nums.length - 1];
        for (int i = 0; i < nums.length - 1; i++) {
            nums[nums.length - 1 - i] = nums[nums.length - 2 - i];
        }
        nums[0] = buf;
    }

}
