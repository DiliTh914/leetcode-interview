package org.example.array.q4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class Solution {

    /**
     * Q4
     * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
     *
     * eg:
     * Input: nums = [1,2,3,1]
     * Output: true
     *
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(!set.add(num)) return true;
        }

        return false;
    }
}
