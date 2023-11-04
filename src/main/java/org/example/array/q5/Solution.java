package org.example.array.q5;

import java.util.HashSet;
import java.util.Set;

class Solution {

    /**
     * Q5
     * Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
     *
     * You must implement a solution with a linear runtime complexity and use only constant extra space.
     *
     * eg:
     * Input: nums = [4,1,2,1,2]
     * Output: 4
     *
     */
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if(!set.add(num)) {
                set.remove(num);
            }
        }

        return set.stream().findAny().get();
    }
}
