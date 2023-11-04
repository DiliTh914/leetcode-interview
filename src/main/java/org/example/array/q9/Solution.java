package org.example.array.q9;

import java.util.HashMap;
import java.util.Map;

class Solution {

    /**
     * Q9
     * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
     *
     * You may assume that each input would have exactly one solution, and you may not use the same element twice.
     *
     * You can return the answer in any order.
     *
     * eg:
     * Input: nums = [2,7,11,15], target = 9
     * Output: [0,1]
     * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
     *
     * Input: nums = [3,2,4], target = 6
     * Output: [1,2]
     *
     * Input: nums = [3,3], target = 6
     * Output: [0,1]
     */
    public int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> map = new HashMap<>();

        int[] out = new int[2];

        for(int i = 0; i< nums.length; i++) {
            int req = target - nums[i];
            if (map.containsKey(req)) {
                out[0] = map.get(req);
                out[1] = i;
                break;
            } else {
                map.put(nums[i], i);
            }

        }

        return out;

    }
}
