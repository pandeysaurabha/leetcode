package com.learning.leetcode.solutions;

import java.util.HashMap;
import java.util.Stack;

public class ValidParenthesesExample {

    public boolean isValid(String s) {

        HashMap<Character, Character> map = new HashMap<Character, Character>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
        Stack st = new Stack();
        for (int i = 0; i < s.length(); i++) {
            if (!st.isEmpty() && map.get(st.peek()) != null && s.charAt(i) == map.get(st.peek())) {
                st.pop();
            } else {
                st.push(s.charAt(i));
            }

        }

        return st.size() == 0 ? true : false;
    }

    public static void main(String[] args) {
        String[] strArray = {"flower", "flow", "flight"};
        ValidParenthesesExample validParenthesesExample = new ValidParenthesesExample();
        System.out.println(validParenthesesExample.isValid("{{}}"));

    }
}
