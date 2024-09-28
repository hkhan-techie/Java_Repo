package com.mywork.problemsovling;

public class SubStringPermutations {
    public static void main(String[] args) {
        String s1 = "ab";
        String s2 = "eidbaooo";
//        String s2 = "eidboaoo";
        System.out.println(subStringPermutations(s1, s2));
    }

    private static boolean subStringPermutations(String s1, String s2) {
        char[] array = s1.toCharArray();
        StringBuilder leftBuffer = new StringBuilder();
        StringBuilder rightBuffer = new StringBuilder();
        int leftIndex = 0;
        int rightIndex = s1.length() - 1;

        while (leftIndex < s1.length() && rightIndex > -1) {
            leftBuffer.append(array[leftIndex]);
            System.out.println("leftBuffer :" + leftBuffer.toString());
            if (leftBuffer.toString().length() > 1 && s2.contains(leftBuffer.toString())) {
                System.out.println("leftBuffer true");
                return true;
            }
            leftIndex += 1;

            rightBuffer.append(array[rightIndex]);
            System.out.println("rightBuffer :" + rightBuffer.toString());
            if (rightBuffer.toString().length() > 1 && s2.contains(rightBuffer.toString())) {
                System.out.println("rightBuffer true");
                return true;
            }
            rightIndex -= 1;
        }
        return false;
    }
}
