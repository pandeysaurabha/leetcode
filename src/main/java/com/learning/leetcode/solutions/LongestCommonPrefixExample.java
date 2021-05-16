package com.learning.leetcode.solutions;

import java.util.Arrays;

public class LongestCommonPrefixExample {

    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        int i=0;
        Arrays.sort(strs);
        for(;i<strs[0].length();i++){
            if(strs[0].charAt(i)!=strs[strs.length-1].charAt(i)){
                break;
            }

        }

        return  strs[0].substring(0,i);
    }

    public static void main(String[] args) {
        String[] strArray = {"flower","flow","flight"};
        LongestCommonPrefixExample longestCommonPrefixExample = new LongestCommonPrefixExample();
        System.out.println(longestCommonPrefixExample.longestCommonPrefix(strArray));

    }
}
