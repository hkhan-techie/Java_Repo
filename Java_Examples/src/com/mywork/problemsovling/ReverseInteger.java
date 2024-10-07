package com.mywork.problemsovling;

public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(123));
        System.out.println(reverseInteger(120));
        System.out.println(reverseInteger(-123));
        System.out.println(reverseInteger(1534236469));
    }

    private static long reverseInteger(long x) {
        boolean isNegative = false;
        if (x < 0) {
            x = x * (-1);
            isNegative = true;
        }
        long temp = 0;
        while (x > 0) {
            if (x == 1) {
                temp = (temp * 10) + x;
                break;
            } else {
                temp = (temp * 10) + (x % 10);
                x = x / 10;
            }

        }

        return isNegative ? temp * (-1) : temp;
    }
}
