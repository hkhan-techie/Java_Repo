package com.mywork.problemsovling;

import java.util.HashMap;

public class FindHighestRepeatableChar {
    public static void main(String[] args) {
        String input = "1abcderbbbbbbcd2";
        findHighestRepeatableCharInString(input);
    }

    private static void findHighestRepeatableCharInString(String input) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] characters = input.toCharArray();
        int highestCount = 0;
        char highestRepeatedChar = 0;
        for (char ch : characters) {
            if (Character.isLetter(ch)) {
                if (map.containsKey(ch)) {
                    int count = map.get(ch) + 1;
                    map.put(ch, count);
                    if (count > highestCount) {
                        highestCount = count;
                        highestRepeatedChar = ch;
                    }
                } else {
                    map.put(ch, 1);
                    highestCount = 1;
                    highestRepeatedChar = ch;
                }
            }

        }
        System.out.println("Repeated character is :" + String.valueOf(highestRepeatedChar) + "   count:" + highestCount);

    }
}

