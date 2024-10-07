package com.mywork.problemsovling;

import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {

//        String s = "()[]{}";
        String s = "([{}]){}[]()";
        System.out.println(validParenthesis(s));
    }

    private static boolean validParenthesis(String s) {
        Stack<Character> stack = new Stack<>();
        char[] chars = s.toCharArray();
        boolean isValid = false;
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (getOpenParen(c) != 0) {
                stack.push(c);
            } else if (getCloseParen(c) != 0) {
                char open = !stack.empty() ? stack.pop() : 0;
                if ((c == open + 1) || (c == open + 2)) {
                    isValid = true;
                } else {
                    isValid = false;
                }
            }
        }
        return isValid;
    }

    private static char getOpenParen(char ch) {
        switch (ch) {
            case '(':
                return '(';
            case '{':
                return '{';
            case '[':
                return '[';
            default:
                return 0;
        }
    }

    private static char getCloseParen(char ch) {
        switch (ch) {
            case ')':
                return ')';
            case '}':
                return '}';
            case ']':
                return ']';
            default:
                return 0;
        }
    }

}
