package com.mywork.problemsovling;

import java.util.ArrayList;
import java.util.List;

public class AsciiValue {

    public static void main(String[] args) {

//        char ch = 'a';
//        int ascii = ch;
//        // You can also cast char to int
//        int castAscii = (int) ch;
//
//        System.out.println("The ASCII value of " + ch + " is: " + ascii);
//        System.out.println("The ASCII value of " + ch + " is: " + castAscii);

        // Sort ascii value of characters and symbols array and print only characters.
        printOnlyCharacters();
        transformAndSwapCharacters();

    }

    private static void transformAndSwapCharacters() {
        
    }

    private static void printOnlyCharacters() {
        List<Character> chars = new java.util.ArrayList<>(List.of('a', '#', 'D', 'e', '$', 'N'));
        chars.sort(Character::compareTo);
        StringBuilder buffer = new StringBuilder();
        for (Character ch : chars) {
            if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122)
                buffer.append(ch);
        }
        System.out.println("buffer: " + buffer.toString());
        List<Integer> list = new ArrayList<>();
    }
}