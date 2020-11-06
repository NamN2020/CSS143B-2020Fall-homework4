package Problem1;
/*
    Nam Nguyen
    November 5, 2020
    CSS 143B
    Homework 4

    Sources: https://youtu.be/IPWmrjE1_MU, https://www.w3resource.com/java-exercises/array/java-array-exercise-68.php

    I was stuck on this question for a whole day and just couldn't figure it out so I went to look for the answer to
    try to understand it more. This is my first time doing recursion so it is still pretty confusing, but that's with
    anything new. The only code I completed myself was the base case. The for-lop with the recursion was from the
    video. After the video I'm starting to understand recursion better. Also I don't expect any credit for this
    segment of the homework.
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

        // I only used this code to understand how the recursion works, I do not want credit for this part.
        // NOT MY CODE
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

