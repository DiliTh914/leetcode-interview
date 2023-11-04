package org.example;

import org.example.array.Solution;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();
        int[] arr = new int[]{0,0,1,1,1,2,2,3,3,4};
        int k = solution.removeDuplicates(arr);

        System.out.println("");

    }
}