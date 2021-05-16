package com.learning.leetcode.solutions;

public class PalindromeNumberExample {

    public boolean isPalindrome(int x) {
        int rev=0;
        int actual=x;
        if(x<0){
            return false;
        }
        while(actual!=0){
            int digit=actual%10;
            if (rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE / 10 && digit > 7))
                return false;
            if (rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE / 10 && digit < -8))
                return false;
            rev=rev*10+digit;
            actual=actual/10;
        }

        return x==rev;
    }

    public static void main(String[] args) {
        PalindromeNumberExample palindromeNumberExample = new PalindromeNumberExample();
        System.out.println(palindromeNumberExample.isPalindrome(121));

    }
}
