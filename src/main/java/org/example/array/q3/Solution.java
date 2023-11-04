package org.example.array.q3;

class Solution {

    /**
     * Q3
     *
     * Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
     *
     * eg:
     * 
     * Input: nums = [1,2,3,4,5,6,7], k = 3
     * Output: [5,6,7,1,2,3,4]
     * Explanation:
     * rotate 1 steps to the right: [7,1,2,3,4,5,6]
     * rotate 2 steps to the right: [6,7,1,2,3,4,5]
     * rotate 3 steps to the right: [5,6,7,1,2,3,4]
     *
     */
    public void rotate(int[] arr, int k) {
        int[] nums = arr.clone();

        k = nums.length > k ? k : k % nums.length;
        int count = 0;

        while (k>0) {
            arr[count] = nums[nums.length-k];
            count++;
            k--;
        }

        int x = 0;

        while (count < nums.length) {
            arr[count] = nums[x];
            count++;
            x++;
        }

    }
}
