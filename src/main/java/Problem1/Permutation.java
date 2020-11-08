package Problem1;
/*
    Nam Nguyen
    November 7, 2020
    CSS 143B
    Homework 4

    Sources: https://youtu.be/IPWmrjE1_MU, https://www.w3resource.com/java-exercises/array/java-array-exercise-68.php
 */

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Permutation {
    public static List<List<Integer>> permute(int[] nums) {
        // homework
        List<List<Integer>> result = new ArrayList<>();
        permute(nums, 0, result);
        return result;
    }

    private static void permute(int[] nums, int position, List<List<Integer>> result) {
        // base case
        if (nums.length == 0) {
            List<Integer> empty = new ArrayList<>();
            result.add(empty);
        } else if (position == nums.length - 1) {
            List<Integer> oneResult = new ArrayList<>();
            for (int i = 0; i < nums.length; i++) {
                oneResult.add(nums[i]);
            }
            result.add(oneResult);
            return;
        }

        // I only used this code to understand how the recursion works
        /*
            My understanding of this for-loop is that it swaps the position with the current i'th
            index and calls permute recursively, than after the recursion is complete it swaps
            back the indexes to their original positions.
         */
        // https://www.w3resource.com/java-exercises/array/java-array-exercise-68.php
        for (int i = position; i < nums.length; i++) {
            int temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;

            permute(nums, position + 1, result);

            temp = nums[i];
            nums[i] = nums[position];
            nums[position] = temp;

        }

    }
}

