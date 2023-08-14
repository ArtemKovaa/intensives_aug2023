package ru.yandex.tasks;

import java.util.ArrayDeque;

public class Task6BraceBalance {
    public static boolean checkBalance(String sequence) {
        /*
         * sequence - последовательность скобок []{}() длины до 10^5
         * Выход: true/false, является ли строка ПСП
         */
        var stack = new ArrayDeque<Character>();
        for (int i = 0; i < sequence.length(); i++) {
            char cur = sequence.charAt(i);
            if (cur == '(' || cur == '[' || cur == '{') stack.add(cur);
            else if (cur == '(' && stack.pop() != ')' || cur == '[' && stack.pop() != ']' || cur == '{' && stack.pop() != '}') return false;
            else stack.pollFirst();
        }
        return stack.isEmpty();
    }

    public static void selfCheck() {
        String test1 = "[({})]{[]}";
        String test2 = "{({})}{";

        assert checkBalance(test1);
        assert !checkBalance(test2);
    }
}
