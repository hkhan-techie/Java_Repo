package com.mywork.problemsovling;

public class LongestSubString {
    public static void main(String[] args) {
        String input = "abcdefcedfefcmabcdefg";
        longestNonRepeatedSubString(input);
    }

    private static void longestNonRepeatedSubString(String input) {
        char[] array = input.toCharArray();
        StringBuilder leftBuffer = new StringBuilder();
        StringBuilder rightBuffer = new StringBuilder();
        boolean leftFoundDuplicate = false;
        boolean rightFoundDuplicate = false;
        int leftIndex = 0;
        int rightIndex = input.length() - 1;

        while (leftIndex < rightIndex) {
            if (leftBuffer.isEmpty()) {
                leftBuffer.append(array[leftIndex]);
            } else {
                if (!leftFoundDuplicate && leftBuffer.indexOf(String.valueOf(array[leftIndex])) == -1) {
                    leftBuffer.append(array[leftIndex]);
                } else {
                    leftFoundDuplicate = true;
                }

            }
            leftIndex += 1;

            if (rightBuffer.isEmpty()) {
                rightBuffer.append(array[rightIndex]);
            } else {
                if (!rightFoundDuplicate && rightBuffer.indexOf(String.valueOf(array[rightIndex])) == -1) {
                    rightBuffer.append(array[rightIndex]);
                } else {
                    rightFoundDuplicate = true;
                }
            }
            rightIndex -= 1;
        }
        if (leftBuffer.toString().length() >= rightBuffer.toString().length()) {
            System.out.println("longest substring is from left :" + leftBuffer.toString());
        } else {
            System.out.println("longest substring is from right :" + rightBuffer.reverse().toString());
        }


    }
}

