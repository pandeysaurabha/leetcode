package com.learning.leetcode.solutions;

import java.util.HashMap;

public class RomanToIntegerExample {

    public int romanToInt(String s) {

        HashMap<Character,Integer> romanValue=new HashMap<Character,Integer>();
        romanValue.put('I',1);
        romanValue.put('V',5);
        romanValue.put('X',10);
        romanValue.put('L',50);
        romanValue.put('C',100);
        romanValue.put('D',500);
        romanValue.put('M',1000);
        int sum=0;
        int size=s.length();
        for(int i=0;i<size;i++){

            if(i!=size-1 && romanValue.get(s.charAt(i))<romanValue.get(s.charAt(i+1))){
                sum=sum+ romanValue.get(s.charAt(i+1))-romanValue.get(s.charAt(i));
                i++;
            }else{
                sum=sum+romanValue.get(s.charAt(i));
            }

        }

        return sum;
    }

    public static void main(String[] args) {
        RomanToIntegerExample romanToIntegerExample = new RomanToIntegerExample();
        System.out.println(romanToIntegerExample.romanToInt("XIX"));

    }
}
