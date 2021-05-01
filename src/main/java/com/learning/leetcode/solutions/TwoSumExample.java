package com.learning.leetcode.solutions;


import java.util.HashMap;
import java.util.Map;

public class TwoSumExample {
    public int[] twoSum(int[] array, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int index = 0; index < array.length; index++) {
            int diff = target - array[index];
            if (map.containsKey(diff)) {
                return new int[]{index, map.get(diff)};
            } else {
                map.put(array[index], index);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        TwoSumExample twoSumExample = new TwoSumExample();
        int[] array = {2, 7, 11, 15};
        int indexes[] = twoSumExample.twoSum(array, 9);

    }


}
