package org.example.array;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            boolean isNew = set.add(nums[i]);
            if (isNew) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
