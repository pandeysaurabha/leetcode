package com.learning.leetcode.solutions;

public class Reverse32BitIntegerExample {

    public int reverse(int x) {

        int rev = 0;
        while (x != 0) {
            int digit = x % 10;
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return 0;
            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return 0;
            rev = rev * 10 + digit;
            x /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {
        Reverse32BitIntegerExample reverse32BitIntegerExample = new Reverse32BitIntegerExample();
        System.out.println(reverse32BitIntegerExample.reverse(123456));

    }
}
