package com.mywork.problemsovling;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
        List<Integer> nums = List.of(-1, 0, 1, 2, -1, -4);
        threeSum(nums);
    }

    private static void threeSum(List<Integer> nums) {
        List<String> stringList = new ArrayList<>();
        int index = 0;
        HashSet<Integer> set = new HashSet<>();
        if (nums.size() < 3) {
            return;
        }
        while (index < nums.size() - 1) {
            int first = nums.get(index);
            int next = nums.get(index + 1);
            for (int i = 0; i < nums.size(); i++) {
                if (i == index || i == index + 1)
                    continue;
                int num = nums.get(i);
                if (first + next + num == 0 && (!set.contains(first) || !set.contains(next) || !set.contains(num))) {
                    set.add(first);
                    set.add(next);
                    set.add(num);
                    stringList.add("[" + first + "," + next + "," + num + "]");
                }
            }
            index += 1;
        }

        System.out.println(stringList);
    }
}
