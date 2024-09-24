package com.mywork.problemsovling;

import java.util.List;

/**
 * Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [3,0,1]
 * Output: 2
 * Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
 */
public class MissingNumber {

    public static void main(String[] args) {
        List<Integer> integers = List.of(3, 0, 1);
        int size = integers.size();
        int missingInteger = -1;
        for (int i = 0; i < size; i++) {
            if (!integers.contains(i)) {
                missingInteger = i;
                break;
            }
        }
        System.out.println(missingInteger);
    }
}
