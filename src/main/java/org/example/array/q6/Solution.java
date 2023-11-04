package org.example.array.q6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

class Solution {

    /**
     * Q6
     * Given two integer arrays nums1 and nums2, return an array of their intersection.
     * Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
     *
     * eg:
     * Input: nums1 = [1,2,2,1], nums2 = [2,2]
     * Output: [2,2]
     *
     * Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
     * Output: [4,9]
     * Explanation: [9,4] is also accepted.
     *
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int num : nums1) {
            map.put(num, map.get(num) == null ? 1 : map.get(num)+1);
        }

        List<Integer> list = new ArrayList<>();

        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                if (map.get(num) > 1) {
                    map.put(num, map.get(num) -1);
                } else {
                    map.remove(num);
                }
            }
        }

        return list.stream().mapToInt(value -> value).toArray();

    }
}
