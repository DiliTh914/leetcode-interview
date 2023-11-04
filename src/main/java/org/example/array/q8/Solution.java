package org.example.array.q8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {

    /**
     * Q8
     * Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
     *
     * Note that you must do this in-place without making a copy of the array.
     *
     * eg:
     * Input: nums = [0,1,0,3,12]
     * Output: [1,3,12,0,0]
     *
     * Input: nums = [0]
     * Output: [0]
     */
    public void moveZeroes(int[] nums) {
        List<Integer> zeroIdx = new ArrayList<>();
        int idxCounter = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeroIdx.add(i);
            } else {
                if (zeroIdx.size()>idxCounter) {
                    nums[zeroIdx.get(idxCounter)] = nums[i];
                    nums[i] = 0;
                    zeroIdx.add(i);
                    idxCounter++;
                }
            }
        }

    }
}
