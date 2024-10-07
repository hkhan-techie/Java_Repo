package com.mywork.problemsovling;

import java.util.ArrayList;

public class LetterCasePermutation {

    public static void main(String[] args) {
        String input = "a1b2";
        letterCasePermutation(input);
    }

    private static void letterCasePermutation(String input) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(input); // First case
        if (!arrayList.contains(input.toLowerCase())) {
            // all lower case scenario
            arrayList.add(input.toLowerCase());
        }
        if (!arrayList.contains(input.toUpperCase())) {
            // all upper case scenario
            arrayList.add(input.toUpperCase());
        }
        char[] chars = input.toCharArray();
        int leftIndex = 0;
        int rightIndex = chars.length - 1;
        while (leftIndex < rightIndex) {
            char[] leftChars = input.toCharArray();
            Character lc = leftChars[leftIndex];
            if (lc.compareTo(Character.toUpperCase(lc)) != 0) {
                leftChars[leftIndex] = Character.toUpperCase(lc);
                String str = String.valueOf(leftChars);
                if (!arrayList.contains(str))
                    arrayList.add(str);
            } else {
                leftChars[leftIndex] = Character.toLowerCase(lc);
                String str = String.valueOf(leftChars);
                if (!arrayList.contains(str))
                    arrayList.add(str);
            }

            leftIndex += 1;


            char[] rightChars = input.toCharArray();
            Character lcr = rightChars[rightIndex];
            if (lcr.compareTo(Character.toUpperCase(lcr)) != 0) {
                rightChars[rightIndex] = Character.toUpperCase(lcr);
                String str = String.valueOf(rightChars);
                if (!arrayList.contains(str))
                    arrayList.add(str);
            } else {
                rightChars[rightIndex] = Character.toLowerCase(lcr);
                String str = String.valueOf(rightChars);
                if (!arrayList.contains(str))
                    arrayList.add(str);
            }

            rightIndex -= 1;
        }

        System.out.println("size of permutation : " + arrayList.size());
        System.out.println("Items of permutation : " + arrayList);
    }


}
