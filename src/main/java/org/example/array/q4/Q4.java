package org.example.array.q4;

import org.example.array.q4.Solution;

public class Q4 {
    public static void main(String[] args) {

        Solution solution = new Solution();

        int[] nums = new int[]{1,2,3,1};
        boolean x = solution.containsDuplicate(nums);
        System.out.println(x);


    }
}