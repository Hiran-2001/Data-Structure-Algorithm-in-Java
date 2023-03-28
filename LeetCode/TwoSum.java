package LeetCode;

import java.util.Arrays;

public class TwoSum {
    public static void main(String[] args) {
        int[] numbers = { 2, 7, 11, 15 };
        int target = 13;

        int[] result = twoSum(numbers, target);
        System.out.println(Arrays.toString(result));
    }

    public static int[] twoSum(int[] numbers, int target) {
        for (int fIndex = 0; fIndex < numbers.length; fIndex++) {
            for (int sIndex = 0; sIndex < numbers.length; sIndex++) {
                if (numbers[fIndex] + numbers[sIndex] == target) {
                    return new int[] { fIndex+1, sIndex };
                }
            }
        }
        return new int[] { -1, -1 };

    }
}
