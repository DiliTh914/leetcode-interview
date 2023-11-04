package org.example.array.q6;

public class Q6 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1,2,2,1};
        int[] nums2 = new int[]{2,2,2};
        int[] x = solution.intersect(nums, nums2);
        System.out.println(x);


    }
}