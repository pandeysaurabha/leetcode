package com.learning.leetcode.solutions;

import java.util.Arrays;

public class LongestCommonPrefixExample {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }

        Arrays.sort(strs);
        int end=strs.length-1;
        int prefix=0;
        int length=strs[0].length();
        for(int i=0;i<length;i++){
            if(strs[0].charAt(i)==strs[end].charAt(i)){
                prefix++;
            }else{
                break;
            }

        }

        return  strs[0].substring(0,prefix);
    }

    public static void main(String[] args) {
        String[] strArray = {"flower","flow","flight"};
        LongestCommonPrefixExample longestCommonPrefixExample = new LongestCommonPrefixExample();
        System.out.println(longestCommonPrefixExample.longestCommonPrefix(strArray));

    }
}
