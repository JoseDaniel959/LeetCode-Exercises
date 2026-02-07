package com.mycompany.app.Programming;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Collections.*;
import java.util.stream.IntStream;

public class ContainsDuplicate {
    public static void main(String[] args) {

        int numsArray[] = { 1, 2, 3,  };
        System.out.println(ContainsDuplicate.containsDuplicate(numsArray));
    }

    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int numsLength = nums.length;
        for (int i = 0; i < numsLength; i++) {
            if (set.contains(nums[i])) {
                return true;
            } else {
                set.add( nums[i]);
            }
        }
        return false;
    }
}