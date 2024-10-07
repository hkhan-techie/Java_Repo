package com.mywork.problemsovling;

import java.util.ArrayList;
import java.util.List;

public class BaseBallGamePoints {

    public static void main(String[] args) {
        System.out.println(calculatePoints(new String[]{"5", "2", "C", "D", "+"}));
    }

    private static int calculatePoints(String[] ops) {
        if (ops.length == 1) {
            return Integer.parseInt(ops[0]);
        }
        List<Integer> list = new ArrayList<>();

        for (String op : ops) {
            int lastIndex = list.size() - 1;
            if ("C".equals(op)) {
                if (!list.isEmpty()) {
                    list.remove(lastIndex);
                }
            } else if ("D".equals(op)) {
                if (!list.isEmpty()) {
                    list.add(list.get(lastIndex) * 2);
                }
            } else if ("+".equals(op)) {
                if (list.size() >= 2) {
                    list.add(list.get(lastIndex) + list.get(lastIndex - 1));
                }
            } else {
                try {
                    list.add(Integer.parseInt(op));
                } catch (Exception e) {
                    System.out.println("exception:" + e.getMessage());
                }
            }

        }

        return list.stream().reduce(Integer::sum).orElse(0);
    }
}
